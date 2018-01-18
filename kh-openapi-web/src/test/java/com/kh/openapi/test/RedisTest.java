package com.kh.openapi.test;

import com.kh.openapi.common.utils.ResourceUtil;
import com.kh.openapi.model.User;
import org.junit.Test;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.beans.Transient;
import java.util.Set;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 11:01 2017/12/13
 */
public class RedisTest extends BaseTest {

    //redis 设置密码   config set requirepass  "123"


    @Resource
    private JedisConnectionFactory jedisConnectionFactory;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void set(){
        stringRedisTemplate.opsForValue().set("1","123");
    }

    @Test
    public void del(){
        stringRedisTemplate.delete("banknotemp");
    }

    @Test
    public void connect(){
        String host = ResourceUtil.getSystem("redis.host");
        String port = ResourceUtil.getSystem("redis.port");

        Jedis jedis = new Jedis(host, Integer.valueOf(port));
        //jedis.auth("234");

        jedis.set("jedis","-----");

    }

    @Test
    public void connect1(){
        Jedis jedis = jedisConnectionFactory.getShardInfo().createResource();
        jedis.set("factory","1111");
    }

    @Test
    public void diff(){
        stringRedisTemplate.opsForSet().add("bankno", "1");
        stringRedisTemplate.opsForSet().add("bankno", "3");
        stringRedisTemplate.opsForSet().add("bankno", "2");
        stringRedisTemplate.opsForSet().add("bankno", "0");
        stringRedisTemplate.opsForSet().add("bankno", "5");

        stringRedisTemplate.opsForSet().add("banknotemp", "2");
        stringRedisTemplate.opsForSet().add("banknotemp", "3");
        stringRedisTemplate.opsForSet().add("banknotemp", "4");

        Set<String> difference = stringRedisTemplate.opsForSet().difference("bankno", "banknotemp");
        Long aLong = stringRedisTemplate.opsForSet().differenceAndStore( "bankno", "banknotemp","bankdiff");
        for (String string:difference) {
            System.out.println(string);
        }

        System.out.println(aLong);

        System.out.println(stringRedisTemplate.opsForSet().members("bankdiff"));

    }

    @Test
    public void sout(){
        int i = 0;

        User user = new User();
        user.setId(1);

        add(user);

        System.out.println(user.getId());

    }

    void add(User user) {
        user.setId(2);
    }

}
