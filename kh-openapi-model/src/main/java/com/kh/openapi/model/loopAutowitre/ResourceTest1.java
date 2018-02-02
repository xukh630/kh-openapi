package com.kh.openapi.model.loopAutowitre;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 所在的包名: com.kh.openapi.service.loopAutowitre
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 11:33 2018/2/1
 */
@Service
public class ResourceTest1 {

    @Resource
    ResourceTest2 resourceTest2;

    public void test1() throws Exception{
        System.out.println("ResourceTest1---->test1");
        test2();
    }

    public void test2()throws Exception{
        String s = "124";
        Integer integer = Integer.valueOf(s);
        System.out.println("ResourceTest1---->test1" + integer);
    }

    public void test3(){
        System.out.println("ResourceTest1---->test3");
        resourceTest2.test2();
    }

    public void deiLoop() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("ResourceTest1---->dieLoop");
        resourceTest2.dieLoop();
    }
}
