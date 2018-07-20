package com.pythe.rest.service.impl;

import java.net.URLEncoder;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.pythe.common.pojo.PytheResult;
import com.pythe.common.utils.DateUtils;
import com.pythe.common.utils.FactoryUtils;
import com.pythe.common.utils.HttpClientUtil;
import com.pythe.mapper.TblTeacherMapper;
import com.pythe.mapper.TblTeacherPerformanceMapper;
import com.pythe.mapper.TblVerificationMapper;
//import com.pythe.mapper.TblWritingMapper;
import com.pythe.mapper.VTeacherPerformanceMapper;
import com.pythe.pojo.TblVerification;
import com.pythe.rest.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private TblVerificationMapper verificationMapper;

	@Value("${MESSAGE_CONTENT_BASE}")
	private String MESSAGE_CONTENT_BASE;
	@Value("${MESSAGE_CONTENT_SUPPLE}")
	private String MESSAGE_CONTENT_SUPPLE;
	@Value("${MESSAGE_USER_ID}")
	private String MESSAGE_USER_ID;
	@Value("${MESSAGE_USER_PASSWORD}")
	private String MESSAGE_USER_PASSWORD;
	@Value("${MESSAGE_API_KEY}")
	private String MESSAGE_API_KEY;

	@Value("${CORRECTION_TYPE}")
	private Integer CORRECTION_TYPE;

	@Value("${REVIEW_TYPE}")
	private Integer REVIEW_TYPE;

	@Value("${ACCEPT_TEACHER_CONTENT_BASE}")
	private String ACCEPT_TEACHER_CONTENT_BASE;

	@Value("${TEACHER_QQ_GROUP}")
	private String TEACHER_QQ_GROUP;

	@Value("${ACCEPT_TEACHER_CONTENT_URL}")
	private String ACCEPT_TEACHER_CONTENT_URL;

	@Value("${PYTHE_CONSULT_EMAIL}")
	private String PYTHE_CONSULT_EMAIL;

	@Value("${ACCEPT_NOTIFY_MSG1}")
	private String ACCEPT_NOTIFY_MSG1;

	@Value("${ACCEPT_NOTIFY_MSG2}")
	private String ACCEPT_NOTIFY_MSG2;

	@Value("${ACCEPT_NOTIFY_MSG3}")
	private String ACCEPT_NOTIFY_MSG3;

	@Value("${ACCEPT_NOTIFY_MSG4}")
	private String ACCEPT_NOTIFY_MSG4;

	@Value("${REJECT_TEACHER_CONTENT_URL}")
	private String REJECT_TEACHER_CONTENT_URL;

	@Value("${REJECT_NOTIFY_MSG1}")
	private String REJECT_NOTIFY_MSG1;

	@Autowired
	private TblTeacherMapper teacherMapper;

	@Autowired
	private TblTeacherPerformanceMapper teacherPerformanceMapper;

	@Autowired
	private VTeacherPerformanceMapper vTeacherPerformanceMapper;

	/**
	 * mobile
	 * 
	 */
	@Override
	public PytheResult singleSend(String url) throws Exception {
		// TODO Auto-generated method stub

		JSONObject message_json = JSONObject.parseObject(url);
		String mobile = message_json.getString("mobile");
		String verificationCode = FactoryUtils.genMessageVerificationCode();
		String content = URLEncoder.encode(new String(MESSAGE_CONTENT_BASE.getBytes("iso8859-1"), "UTF-8")
				+ verificationCode + new String(MESSAGE_CONTENT_SUPPLE.getBytes("iso8859-1"), "UTF-8"), "GBK");

		String timestamp = DateUtils.formatTimeStampKey(new Date());
		System.out.println(timestamp);

		message_json.put("apikey", MESSAGE_API_KEY);
		message_json.put("mobile", mobile);
		message_json.put("content", content);
		message_json.put("timestamp", timestamp);
		// 判断返回码
		String str = "";
		// String monternet_url = "http://api01.monyun.cn:7901/sms/v2/std/";
		String monternet_url = "http://114.67.62.211:7901/sms/v2/std/single_send";
		str = HttpClientUtil.doPostJson(monternet_url, message_json.toString());
		int result = JSONObject.parseObject(str).getInteger("result");

		if (result == 0) {
			System.out.println(str);
			TblVerification verification = new TblVerification();
			verification.setGenerateTime(new Date());
			verification.setUserPhoneNumber(mobile);
			verification.setVerificationCode(verificationCode);
			verificationMapper.insert(verification);
			return PytheResult.ok(str);
		} else {
			return PytheResult.build(500, "单条发送失败，错误码" + result);
		}

	}

}
