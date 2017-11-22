package com.kh.openapi.model.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 所在的包名: com.kh.openapi.model.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 18:22 2017/11/12
 */
public class ListenerBindingTest implements HttpSessionBindingListener {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("对象与session绑定了...");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("对象与session解除绑定了...");
    }
}
