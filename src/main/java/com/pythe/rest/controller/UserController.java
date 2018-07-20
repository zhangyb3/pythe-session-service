package com.pythe.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pythe.common.pojo.PytheResult;
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

	@PostMapping("/teacher/register")
	public PytheResult teacherRegister(@RequestBody String params) {

		PytheResult result = userService.register(params);

		return result;
	}

	@PostMapping("/teacher/login")
	public PytheResult teacherLogin(@RequestBody String params) {

		PytheResult result = userService.login(params);

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
