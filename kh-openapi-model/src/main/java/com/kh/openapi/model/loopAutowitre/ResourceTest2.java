package com.kh.openapi.model.loopAutowitre;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 所在的包名: com.kh.openapi.service.loopAutowitre
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 11:35 2018/2/1
 */
@Service
public class ResourceTest2 {

    @Resource
    ResourceTest1 resourceTest1;

    public void test1(){
        try {

            System.out.println("ResourceTest2---->test1");
        } catch (Exception e) {
            System.out.println("出错了");
        }
    }

    public void test2(){
        try {
            resourceTest1.test1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ResourceTest2---->test2");
    }

    public void dieLoop() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("ResourceTest2---->dieLoop");
        resourceTest1.deiLoop();
    }
}
