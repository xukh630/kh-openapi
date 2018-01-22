package com.kh.openapi.service.aop.annotation;

import com.kh.openapi.service.aop.AopTest;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 所在的包名: com.kh.openapi.service.aop.annotation
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:46 2018/1/18
 */
@Component
@Aspect
public class AopTestImpl1Annotation implements AopTest {
    @Override
    @Pointcut
    public void printTest() {
        System.out.println("AopTestImpl1Annotation printTest");
    }

    @Override
    public void doPrint() {
        System.out.println("AopTestImpl1Annotation doPrint");
    }

    @Before("printTest()")
    public void before(){
        System.out.println("---------------------brfore");
    }

    @After("printTest()")
    public void after(){
        System.out.println("---------------------after");
    }

    @Around("printTest()")
    public void around(){
        System.out.println("---------------------around");
    }
}
