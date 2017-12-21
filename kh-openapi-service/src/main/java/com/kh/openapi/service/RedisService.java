package com.kh.openapi.service;

import com.kh.openapi.facade.IRedisService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 所在的包名: com.kh.openapi.service
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:20 2017/12/13
 */
@Service
public class RedisService implements IRedisService{

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void getDiffer() {
            stringRedisTemplate.opsForValue().set("tui","1.8m");
    }
}
