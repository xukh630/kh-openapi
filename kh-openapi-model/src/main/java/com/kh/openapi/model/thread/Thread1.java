package com.kh.openapi.model.thread;

/**
 * 所在的包名: com.kh.openapi.model.thread
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 22:35 2018/1/11
 */
public class Thread1 extends Thread {

    @Override
    public void run(){
        synchronized (Lock.lock1){
            System.out.println("我是线程1,拿到锁1,去锁2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Lock.lock2) {
                System.out.println("我是线程1,已拿到锁2");
            }
            System.out.println("线程一  呵呵");
        }
    }
}
