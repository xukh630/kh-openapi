package com.kh.openapi.test;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 17:52 2018/1/8
 */
public class RunnableTest implements Runnable {

    @Override
    public void run() {

    }

    //创建Runnable对象 --------------------------------------------------------------------------------------------------------------------------------------
    /*** 1.创建实现了Runnable接口的匿名类    ***/
    Runnable r = new Runnable() {

        @Override
        public void run() {
            System.out.println("hello from Thread");
        }
    };

    /***lambda***/
    Runnable ru = () -> System.out.println("thread");


}
