package com.pythe.rest.service.impl;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.pythe.common.pojo.PytheResult;
import com.pythe.common.utils.FactoryUtils;
import com.pythe.common.utils.MD5Util;
import com.pythe.common.utils.RedisUtil;
import com.pythe.mapper.TblSaltMapper;
import com.pythe.mapper.TblTeacherAccountMapper;
import com.pythe.mapper.TblTeacherMapper;
import com.pythe.mapper.TblTeacherPerformanceMapper;
import com.pythe.mapper.TblVerificationMapper;
import com.pythe.pojo.TblSalt;
import com.pythe.pojo.TblSaltExample;
import com.pythe.pojo.TblTeacher;
import com.pythe.pojo.TblTeacherAccount;
import com.pythe.pojo.TblTeacherExample;
import com.pythe.pojo.TblTeacherPerformance;
import com.pythe.pojo.TblVerification;
import com.pythe.pojo.TblVerificationExample;
import com.pythe.rest.service.UserService;

@PropertySource(value = { "classpath:resource/db.properties" })
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private RedisUtil redisUtil;

	@Autowired
	private TblVerificationMapper verificationMapper;

	@Autowired
	private TblTeacherMapper teacherMapper;

	@Autowired
	private TblTeacherAccountMapper teacherAccountMapper;

	@Autowired
	private TblTeacherPerformanceMapper teacherPerformanceMapper;

	@Autowired
	private TblSaltMapper saltMapper;

	@Value("${jdbc.url}")
	private String url;

	// 手机密码注册
	@Override
	public PytheResult register(String params) {

		// System.out.println(url);
		// 用户
		JSONObject userInformation = JSONObject.parseObject(params);

		String verificationCode = userInformation.getString("verificationCode").trim();
		String password = userInformation.getString("password").trim();
		String phoneNum = userInformation.getString("phoneNum").trim();
		String userName = userInformation.getString("userName").trim();
		Integer status = userInformation.getInteger("status");

		// 注意：用户没有注册，是不可能跳掉这里来的。(只需要判断验证码即可)
		TblVerificationExample example = new TblVerificationExample();
		example.createCriteria().andUserPhoneNumberEqualTo(phoneNum)
				.andGenerateTimeGreaterThanOrEqualTo(new DateTime().minusMinutes(1).toDate());
		example.setOrderByClause("generate_time DESC");

		List<TblVerification> verificationList = verificationMapper.selectByExample(example);
		// 验证码对象不存在：是因为之前没有插入或者超时导致的
		if (verificationList.size() == 0) {
			System.out.println(new DateTime().minusMinutes(1).toDate());
			return PytheResult.build(400, "验证码过期");
		}
		TblVerification verification_info = verificationList.get(0);

		// 验证码不正确
		if (!verification_info.getVerificationCode().equals(verificationCode)) {
			return PytheResult.build(400, "验证码错误");
		}

		TblTeacherExample teacherExample = new TblTeacherExample();
		teacherExample.createCriteria().andPhonenumEqualTo(phoneNum);
		List<TblTeacher> originalTeachers = teacherMapper.selectByExample(teacherExample);
		if (originalTeachers.isEmpty()) {
			TblTeacher teacher = new TblTeacher();
			teacher.setPhonenum(phoneNum);

			TblSaltExample saltExample = new TblSaltExample();
			saltExample.createCriteria().andPhoneNumEqualTo(phoneNum);
			saltMapper.deleteByExample(saltExample);
			TblSalt salt = new TblSalt();
			salt.setId(FactoryUtils.getUUID());
			salt.setPhoneNum(phoneNum);
			salt.setSalt(FactoryUtils.getUUID());
			String storedPassword = password.concat(salt.getSalt());
			storedPassword = MD5Util.string2MD5(storedPassword);
			saltMapper.insert(salt);

			teacher.setUsername(userName);
			teacher.setPassword(storedPassword);
			teacher.setStatus(status);
			teacher.setCreated(new Date());
			teacher.setLevel(-1);
			teacherMapper.insert(teacher);

			// redis存放session
			String token = FactoryUtils.getUUID();
			String checkToken = (String) redisUtil.get("teacher-" + teacher.getTeacherId());
			if (checkToken != null) {
				token = checkToken;
			}
			redisUtil.set(String.valueOf(token), JSONObject.toJSONString(teacher));
			redisUtil.set("teacher-" + teacher.getPhonenum(), token);

			// 加入老师账户
			TblTeacherAccount teacherAccount = new TblTeacherAccount();
			teacherAccount.setUserId(teacher.getTeacherId());
			teacherAccount.setAmount(0D);
			teacherAccount.setInAmount(0D);
			teacherAccount.setOutAmount(0d);
			teacherAccount.setGivingAmount(0d);
			teacherAccount.setLevel(0);
			teacherAccountMapper.insert(teacherAccount);

			// 加入到推送任务的待定范围，非注册即可推送，需要资格审核
			TblTeacherPerformance teacherPerformance = new TblTeacherPerformance();
			teacherPerformance.setTeacherId(teacher.getTeacherId());
			teacherPerformance.setUpdated(new Date());
			teacherPerformance.setLastMission(0);
			teacherPerformance.setLevel(0);
			teacherPerformance.setScore(0);
			teacherPerformance.setStatus(-1);// 等待审核
			teacherPerformance.setDescription("未审核");
			teacherPerformanceMapper.insert(teacherPerformance);

			JSONObject result = new JSONObject();
			result.put("token", token);
			teacher.setPassword(null);
			result.put("teacher", teacher);

			return PytheResult.build(668, "须完善资料", result);
		} else {
			return PytheResult.build(600, "该手机号已注册过");
		}
	}

}
