package com.kh.openapi.model.thread;

/**
 * 所在的包名: com.kh.openapi.model.thread
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 22:57 2018/1/12
 */
public class ThreadDaemon {

    //默认的主线程结束后,后台守护线程会直接结束
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                Thread thd = Thread.currentThread();
                while (true) {
                    System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().isAlive());
                }
            }
        };

        Thread th1 = new Thread(r, "th1");
        th1.setDaemon(true);
        System.out.println(th1.isAlive());

        Thread th2 = new Thread(r, "th2");
        th2.setDaemon(true);
        System.out.println(th2.isAlive());

        th1.start();
        th2.start();
    }
}
