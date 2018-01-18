package com.kh.openapi.test;

import com.kh.openapi.service.aop.AopTest;
import com.kh.openapi.service.aop.impl.AopTestImpl1;
import com.kh.openapi.service.aop.impl.AopTestImpl2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 10:35 2018/1/17
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath*:spring/spring-aop.xml"})
public class springTest extends BaseTest{

    /*@Resource
    private AopTestImpl1 at1;
    @Resource
    private AopTestImpl2 at2;*/

    @Test
    public void aopTest(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring/spring-aop.xml");

        AopTest at1 = (AopTest) ctx.getBean("aopTestImpl1");
        AopTest at2 = (AopTest) ctx.getBean("aopTestImpl2");

        at1.printTest();
        System.out.println();
        at1.doPrint();

        System.out.println();
        at2.printTest();
        System.out.println();
        at2.doPrint();
    }


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring/spring-aop.xml");

        AopTest at1 = (AopTest) ctx.getBean("aopTestImpl1");
        AopTest at2 = (AopTest) ctx.getBean("aopTestImpl2");

        at1.printTest();
        System.out.println();
        at1.doPrint();

        System.out.println();
        at2.printTest();
        System.out.println();
        at2.doPrint();
    }
}
