package com.kh.openapi.service.aop.impl;

import com.kh.openapi.service.aop.AopTest;

/**
 * 所在的包名: com.kh.openapi.service.aop.impl
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 23:23 2018/1/16
 */
public class AopTestImpl1 implements AopTest {
    @Override
    public void printTest() {
        System.out.println("impl1 printTest");
    }

    @Override
    public void doPrint() {
        System.out.println("impl1 doPrint");
    }
}
