package com.pythe.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pythe.common.utils.RedisUtil;
import com.pythe.common.utils.SnowflakeIdWorker;
import com.pythe.config.*;
import com.alibaba.fastjson.*;

@RestController
@RequestMapping("/test/cache/redis")
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
	

	@PostMapping("/post/test")
	public String postTest(@RequestBody String params){
		
		JSONObject parameters = JSONObject.parseObject(params);
		String name = parameters.getString("name");
		
		Long token = SnowflakeIdWorker.getSeqID();
		redisUtil.set(String.valueOf(token), name);
		
		return "post success";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
