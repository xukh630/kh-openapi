package com.kh.openapi.test;

import com.kh.openapi.common.enums.PayPlatform;
import com.kh.openapi.common.result.ResultModle;
import com.kh.openapi.dao.UserMapper;
import com.kh.openapi.dao.UserMapperExt;
import com.kh.openapi.facade.IUserService;
import com.kh.openapi.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.collections.Maps;
import org.testng.collections.Sets;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 22:09 2017/11/22
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest extends BaseTest {

    @Resource
    private IUserService userService;
    @Resource
    private UserMapperExt userMapperExt;

    @Test
    public void add(){
        User user = new User();
        user.setId(13);
        user.setUsername("xukh");
        user.setPassword("123456");
        user.setNickname("xukh");

        userMapperExt.updateByPrimaryKeySelective(user);
    }

    @Test
    public void test(){
        System.out.println("11111");
    }


    public static void main(String[] args) {

        Set set = Sets.newHashSet();

        User user = new User();
        user.setId(1);

        User user1 = new User();
        user1.setId(1);

        set.add(user);
        set.add(user1);

        System.out.println(set.size());
        System.out.println(set.contains(user));
        System.out.println(set.contains(user1));
        System.out.println(user==user1);
        System.out.println(user.hashCode()==user.hashCode());

        Map<Object, Object> map = Maps.newHashMap();
        map.put("1","1");
        map.put("1","2");

        System.out.println(map.size());
        System.out.println(map.get("1"));


    }
}
