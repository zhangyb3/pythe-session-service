package com.pythe.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pythe.common.pojo.PytheResult;
import com.pythe.common.utils.ExceptionUtil;
import com.pythe.common.utils.RedisUtil;
import com.pythe.rest.service.UserService;

@RestController
@RequestMapping("/pythe-session-service/user")
public class UserController {

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private RedisUtil redisUtil;

	@Autowired
	private UserService userService;

	@PostMapping("/teacher/token/check")
	public Object teacherTokenCheck(@RequestBody String params) {

		try {
			return userService.tokenCheck(params);
		} catch (Exception e) {
			e.printStackTrace();
			return PytheResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@PostMapping("/teacher/register")
	public PytheResult teacherRegister(@RequestBody String params) {

		try {
			return userService.register(params);
		} catch (Exception e) {
			e.printStackTrace();
			return PytheResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@PostMapping("/teacher/login")
	public PytheResult teacherLogin(@RequestBody String params) {

		try {
			return userService.login(params);
		} catch (Exception e) {
			e.printStackTrace();
			return PytheResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@PostMapping("/teacher/token/login")
	public PytheResult teacherTokenLogin(@RequestHeader(value = "token") String token, @RequestBody String params) {

		try {
			return userService.tokenLogin(token, params);
		} catch (Exception e) {
			e.printStackTrace();
			return PytheResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	/**
	 * 老师手机动态登录
	 * 
	 * @return
	 */
	@PostMapping(value = "/teacher/verificationCode/login")
	public PytheResult userVerificationCodeLogin(@RequestBody String parameters) {
		try {
			return userService.verificationCodeLogin(parameters);
		} catch (Exception e) {
			e.printStackTrace();
			return PytheResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	@PostMapping(value = "/teacher/reset/password")
	public PytheResult resetPassword(@RequestBody String parameters) {
		try {
			return userService.resetPassword(parameters);
		} catch (Exception e) {
			e.printStackTrace();
			return PytheResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	/**
	 * 手机注册用户退出登录
	 * 
	 * @return
	 */
	@PostMapping(value = "/teacher/token/logout")
	public PytheResult userLogout(@RequestHeader(value = "token") String token, @RequestBody String parameters) {
		try {
			return userService.tokenLogout(token, parameters);
		} catch (Exception e) {
			e.printStackTrace();
			return PytheResult.build(500, ExceptionUtil.getStackTrace(e));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
