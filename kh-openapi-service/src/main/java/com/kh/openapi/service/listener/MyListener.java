package com.kh.openapi.service.listener;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 所在的包名: com.kh.openapi.service.listener
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 17:15 2017/11/12
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象被创建了...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象被销毁的...");
    }
}
