package com.kh.openapi.service.aop.annotation;

import com.kh.openapi.service.aop.AopTest;
import org.springframework.stereotype.Component;

/**
 * 所在的包名: com.kh.openapi.service.aop.annotation
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:46 2018/1/18
 */
@Component
public class AopTestImpl2Annotation implements AopTest {
    @Override
    public void printTest() {
        System.out.println("AopTestImpl2Annotation printTest");
    }

    @Override
    public void doPrint() {
        System.out.println("AopTestImpl2Annotation doPrint");
    }
}
