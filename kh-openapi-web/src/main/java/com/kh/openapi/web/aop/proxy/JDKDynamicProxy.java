package com.kh.openapi.web.aop.proxy;

import com.kh.openapi.facade.aop.proxy.Greeting;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 所在的包名: com.kh.openapi.service.aop.proxy
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:    JDK动态代理
 * @Date: Created in 16:31 2018/2/5
 */
public class JDKDynamicProxy implements InvocationHandler {

    private Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    @Override
    public Object invoke(Object roxy, Method method, Object[] args) throws Throwable {
        //before();
        Object result = method.invoke(target, args);
        //after();
        return result;
    }

    private void before() {
        System.out.println("JDKDynamicProxy Before");
    }

    private void after() {
        System.out.println("JDKDynamicProxy After");
    }

    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
        greeting.sayHello("aa");

    }
}
