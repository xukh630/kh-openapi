package com.kh.openapi.model.thread;

/**
 * 所在的包名: com.kh.openapi.model.thread
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 22:31 2018/1/11
 */
public class Lock {
     static Object lock1 = new Object();
     static Object lock2 = new Object();


    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();

        Thread.sleep(2000);
        t2.start();
    }
}


