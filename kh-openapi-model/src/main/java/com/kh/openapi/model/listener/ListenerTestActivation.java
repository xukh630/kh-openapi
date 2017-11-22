package com.kh.openapi.model.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * 所在的包名: com.kh.openapi.model.listener
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 18:27 2017/11/12
 */
public class ListenerTestActivation implements HttpSessionActivationListener {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 钝化:将对象序列化到硬盘.
     * 监听HttpSession中JavaBean的钝化的方法
     * @param se
     */
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("对象被session钝化了...");
    }

    /**
     * 将硬盘对象反序列化过程.
     * 监听HttpSession中JavaBean的活化的方法:
     * @param se
     */
    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("对象被ssession活化了...");
    }
}
