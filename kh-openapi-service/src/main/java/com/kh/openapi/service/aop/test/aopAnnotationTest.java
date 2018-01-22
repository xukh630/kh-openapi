package com.kh.openapi.service.aop.test;

import com.kh.openapi.service.aop.annotation.TimeHandlerAnnotation;
import com.kh.openapi.service.aop.other.BraveKnight;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 所在的包名: com.kh.openapi.service.aop.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:53 2018/1/18
 */
public class aopAnnotationTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring/spring-aop.xml");

        BraveKnight braveKnight = (BraveKnight) ctx.getBean("knight");

        braveKnight.saying();

    }
}
