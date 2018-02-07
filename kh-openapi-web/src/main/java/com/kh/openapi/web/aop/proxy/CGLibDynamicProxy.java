package com.kh.openapi.web.aop.proxy;

import com.kh.openapi.facade.aop.proxy.Greeting;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 所在的包名: com.kh.openapi.service.aop.proxy
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:    CGLIB动态代理
 * @Date: Created in 17:44 2018/2/5
 */
public class CGLibDynamicProxy implements MethodInterceptor{
    private static CGLibDynamicProxy instance = new CGLibDynamicProxy();

    public CGLibDynamicProxy() {
    }

    public static CGLibDynamicProxy getInstance(){
        return instance;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object result = proxy.invokeSuper(target, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("CGLibDynamicProxy Before");
    }

    private void after() {
        System.out.println("CGLibDynamicProxy After");
    }

    public static void main(String[] args) {
        Greeting greeting = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
        greeting.sayHello("Jack");
    }
}
