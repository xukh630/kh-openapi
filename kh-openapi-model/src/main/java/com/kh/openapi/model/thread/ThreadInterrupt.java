package com.kh.openapi.model.thread;

/**
 * 所在的包名: com.kh.openapi.model.thread
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 23:12 2018/1/12
 */
public class ThreadInterrupt {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                int count = 0;
                /*while (!Thread.interrupted()) {
                }*/
                System.out.println(name +"   "+count ++);
            }
        };

        Thread thread1 = new Thread(r, "thread1");
        Thread thread2 = new Thread(r, "thread2");

        thread1.start();
        thread2.start();

        while (true) {
            double random = Math.random();
            if (random >= 0.49 && random <=0.5) {
                break;
            }
        }


        thread1.interrupt();
        thread2.interrupt();


    }
}


