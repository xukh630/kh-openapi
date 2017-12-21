package com.kh.openapi.test;

import com.kh.openapi.model.from.TransientUser;
import org.junit.Test;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 21:10 2017/11/28
 */
public class SerializableTest extends BaseTest{

    @Test
    public void serializable(){
        TransientUser user = new TransientUser();
        System.out.println(user);


    }
}


