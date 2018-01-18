package com.kh.openapi.service.aop.impl;

import com.kh.openapi.common.utils.RandomUtil;

import java.util.Random;

/**
 * 所在的包名: com.kh.openapi.service.aop.impl
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 22:57 2018/1/17
 */
public class RandomNum {

    public void printNum(){
        System.out.println(new Random().nextInt(1000));
    }
}
