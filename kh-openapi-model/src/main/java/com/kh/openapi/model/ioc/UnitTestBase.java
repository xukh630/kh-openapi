package com.kh.openapi.model.ioc;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 所在的包名: com.kh.openapi.model.ioc
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 21:11 2018/1/4
 */
public class UnitTestBase {

    private ClassPathXmlApplicationContext content;

    private String springXmlPath;

    public UnitTestBase(){

    }

    public UnitTestBase(String springXmlPath){
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before(){
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }
    }



}
