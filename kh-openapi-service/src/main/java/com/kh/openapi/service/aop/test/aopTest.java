package com.kh.openapi.service.aop.test;

import com.kh.openapi.service.aop.AopTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 所在的包名: com.kh.openapi.service.aop.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:49 2018/1/18
 */
public class aopTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring/spring-aop.xml");

        AopTest at1 = (AopTest) ctx.getBean("aopTestImpl1");
        AopTest at2 = (AopTest) ctx.getBean("aopTestImpl2");

        at1.printTest();
        System.out.println();
        at1.doPrint();

        System.out.println();
        //at2.printTest();
        System.out.println();
        //at2.doPrint();
    }
}
