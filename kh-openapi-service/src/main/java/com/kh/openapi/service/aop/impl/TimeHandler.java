package com.kh.openapi.service.aop.impl;

import com.kh.openapi.common.utils.DateUtil;

/**
 * 所在的包名: com.kh.openapi.service.aop.impl
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 23:30 2018/1/16
 */
public class TimeHandler {

    public void printTime(){
        System.out.println(DateUtil.getNow());
    }
}
