package com.kh.openapi.service.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * 所在的包名: com.kh.openapi.service.aop.annotation
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:47 2018/1/18
 */

public class RandomNumAnnotation {

    public void printNum(){
        System.out.println(new Random().nextInt(1000));
    }


}
