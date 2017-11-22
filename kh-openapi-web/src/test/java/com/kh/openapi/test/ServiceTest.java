package com.kh.openapi.test;

import com.kh.openapi.common.utils.DateUtil;
import com.kh.openapi.dao.UserMapper;
import com.kh.openapi.dao.UserMapperExt;
import com.kh.openapi.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import javax.annotation.Resource;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 17:49 2017/11/9
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class ServiceTest extends BaseTest {

    @Resource
    private UserMapperExt userMapperExt;

    @Test
    public void serviceTest(){
        User user = new User();
        user.setId(9);
        user.setUsername("徐楷洪");
        user.setPassword("123456");
        user.setCreateTime(DateUtil.getNow());
        user.setStatus(1);
        int result = userMapperExt.insertSelective(user);
        System.out.println(result);
        assert (result == 1);
    }

    @Test
    public void sout(){
        System.out.println("111111111");
    }
}
