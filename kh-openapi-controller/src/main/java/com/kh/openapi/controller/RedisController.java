package com.kh.openapi.controller;

import com.kh.openapi.facade.IRedisService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 所在的包名: com.kh.openapi.controller
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:19 2017/12/13
 */
@RequestMapping("/redis")
@RestController
public class RedisController {

    @Resource
    private IRedisService redisService;

    @RequestMapping("/diff")
    public void diff(){
        redisService.getDiffer();
    }
}
