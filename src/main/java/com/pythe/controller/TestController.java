package com.pythe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pythe.config.*;
import com.pythe.util.RedisUtil;

@RestController
@RequestMapping("/cache/redis")
public class TestController {
	
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@Autowired
    private RedisUtil redisUtil;
	
	
	@RequestMapping("/insert/test")
    public String  redisInsertTest(){
        redisUtil.set("123", "hello redis");
        System.out.println("进入了方法");
        String string= redisUtil.get("123").toString();
        return string;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
