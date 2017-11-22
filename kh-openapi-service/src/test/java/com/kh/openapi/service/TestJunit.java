package com.kh.openapi.service;

import com.kh.openapi.common.utils.DateUtil;
import com.kh.openapi.dao.UserMapperExt;
import com.kh.openapi.facade.ITestService;
import com.kh.openapi.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


/**
 * 所在的包名: com.kh.openapi.service
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 11:47 2017/10/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-context.xml", "classpath*:spring/spring-context-datasource.xml"})
public class TestJunit {

    @Resource
    private ITestService testService;
    @Resource
    private UserMapperExt userMapperExt;

    @Test
    public void outputTest(){

        User user = new User();
        user.setId(8);
        user.setUsername("徐楷洪");
        user.setPassword("123456");
        user.setCreateTime(DateUtil.getNow());
        user.setStatus(1);
        int result = userMapperExt.insertSelective(user);
        System.out.println(result);
        assert (result == 1);
    }
}
