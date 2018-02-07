package com.kh.openapi.web.aop.proxy;

import com.kh.openapi.facade.aop.proxy.Greeting;

/**
 * 所在的包名: com.kh.openapi.service.aop.proxy
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 15:59 2018/2/5
 */
public class GreetingProxy implements Greeting{

    private GreetingImpl greetingImpl;

    public GreetingProxy(GreetingImpl greetingImpl) {
        this.greetingImpl = greetingImpl;
    }

    @Override
    public void sayHello(String name) {
        before();
        greetingImpl.sayHello(name);
        after();
    }

    private void before() {
        System.out.println("GreetingProxy Before");
    }

    private void after() {
        System.out.println("GreetingProxy After");
    }

    public static void main(String[] args) {
        Greeting greetingProxy = new GreetingProxy(new GreetingImpl());
        greetingProxy.sayHello("Jack");
    }
}
