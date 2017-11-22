package com.kh.openapi.dao;

import com.kh.openapi.common.utils.DateUtil;
import com.kh.openapi.model.User;
import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import javax.annotation.Resource;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.testng.Assert.*;

public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Resource
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");//加载spring配置文件
        userMapper = applicationContext.getBean(UserMapper.class);//在这里导入要测试的
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void insert() throws Exception {

        User user = new User();
        user.setUsername("徐楷洪");
        user.setPassword("123456");
        user.setCreateTime(DateUtil.getNow());
        user.setStatus(1);
        int result = userMapper.insertSelective(user);
        System.out.println(result);
        assert (result == 1);

    }


    /*public static void main(String[] args) {

        Pattern p = Pattern.compile("a,b,c");
        System.out.println(p);

        //Pattern split
        *//*Pattern p = Pattern.compile(",");
        String[] split = p.split("a,b,c");

        for (int i = 0 ; i < split.length ; i++) {
            System.out.println(split[i]);
        }*//*

        //boolean matches = Pattern.matches("11111","11111");

        Matcher matcher = p.matcher("123");
        Matcher matcher1 = p.matcher("321");
        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());

    }*/

    public static void main(String[] args) {
        Pattern p = Pattern.compile("[^0-9{1,}]");
        Matcher matcher = p.matcher("12");
        boolean matches = matcher.matches();
        System.out.println(matches);




    }
}