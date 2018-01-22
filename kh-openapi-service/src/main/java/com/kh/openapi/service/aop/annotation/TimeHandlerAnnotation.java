package com.kh.openapi.service.aop.annotation;

import com.kh.openapi.common.utils.DateUtil;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 所在的包名: com.kh.openapi.service.aop.annotation
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:47 2018/1/18
 */
@Component("timeHandlerAnnotation")
public class TimeHandlerAnnotation {

    public void printTest(){
        System.out.println(DateUtil.getNow());
    }
}
