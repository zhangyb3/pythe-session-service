package com.pythe.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pythe.common.pojo.PytheResult;
import com.pythe.common.utils.RedisUtil;
import com.pythe.common.utils.SnowflakeIdWorker;
import com.pythe.config.*;
import com.pythe.pojo.TblTeacher;
import com.pythe.rest.service.UserService;
import com.alibaba.fastjson.*;

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
	public PytheResult teacherRegister(@RequestBody String params){
		
		
		PytheResult result = userService.register(params);
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
