package com.kh.openapi.model.thread;

/**
 * 所在的包名: com.kh.openapi.model.thread
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 14:46 2018/1/11
 */
public class TicketRunnable implements Runnable {

    private int tickets = 100;

    private Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("线程 :"+Thread.currentThread().getName() + "卖" + tickets--  );
                } else {
                    break;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }

                System.out.println("剩余票数 :     "+tickets  );
            }
        }
    }

}




class TicketDemo{
    public static void main(String[] args) {
        TicketRunnable ticketRunnable = new TicketRunnable();

        Thread t1 = new Thread(ticketRunnable, "线程一");
        Thread t2 = new Thread(ticketRunnable, "线程二");
        Thread t3 = new Thread(ticketRunnable, "线程三");

        t1.start();
        t2.start();
        t3.start();
    }

}
