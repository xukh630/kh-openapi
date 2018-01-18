package com.kh.openapi.model.thread;

import java.util.concurrent.locks.Lock;

/**
 * 所在的包名: com.kh.openapi.model.thread
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:37 2018/1/9
 */
public class MyThread extends Thread {
//sleep 释放锁  wait 不释放锁


    @Override
    public void run(){
        while (true) {
            System.out.println("线程结束");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        //守护线程
        //myThread.setDaemon(true);
        //myThread.start();
        //加入线程
        //myThread.join();

        //myThread设置为加入线程,所以只有当mt线程执行完后,say hello 才会执行
        Thread.sleep(1000);
        System.out.println(myThread.getPriority());  //获取线程优先级  默认为5   范围是  1~10
        myThread.setPriority(Thread.MAX_PRIORITY);   //数字越高,执行的优先级越高
        System.out.println(myThread.getPriority());
        System.out.println("say hello");

    }
}
