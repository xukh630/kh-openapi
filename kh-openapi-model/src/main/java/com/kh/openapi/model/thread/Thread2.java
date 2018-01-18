package com.kh.openapi.model.thread;

/**
 * 所在的包名: com.kh.openapi.model.thread
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 22:39 2018/1/11
 */
public class Thread2 extends Thread {

    @Override
    public void run(){
        synchronized (Lock.lock2) {
            System.out.println("我是线程2,拿到锁2,去锁1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Lock.lock1) {
                System.out.println("我是线程2,已拿到锁1");
            }

            System.out.println("线程二呵呵");
        }
    }
}
