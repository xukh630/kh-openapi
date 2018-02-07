package com.kh.openapi.web.aop.proxy;

import com.kh.openapi.facade.aop.proxy.Greeting;

/**
 * 所在的包名: com.kh.openapi.service.aop.proxy
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 15:55 2018/2/5
 */
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        before();
        System.out.println("hello this is GreetingImpl");
        after();
    }

    public void before(){
        System.out.println("GreetingImpl Before");
    }

    public void after(){
        System.out.println("GreetingImpl After");
    }
}
