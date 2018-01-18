package com.kh.openapi.test;

import com.kh.openapi.model.thread.MyThread;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.testng.collections.Lists;
import org.testng.collections.Maps;

import java.util.List;
import java.util.Map;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 20:42 2017/12/31
 */
public class ThreadTest extends BaseTest{

    Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println(1);
        }
    };

    @Test
    public void twoThread(){
        Map<Object, Object> map = Maps.newHashMap();
        for (int i = 0 ; i < 1000000 ; i++) {
            map.put(i,i);
        }

        Thread t1 = new Thread(r,"1");
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        long startTime = System.currentTimeMillis();
        for (int j = 0 ; j < 100 ; j++) {
            map.put(j,j+100);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(startTime+" "+endTime +" 花费时间"+(startTime-endTime));
    }

    /**
     * 线程存活状态
     * 线程寿命起始于在start方法  结束于离开run方法
     */
    @Test
    public void isAlive(){
        MyThread thread = new MyThread();
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println(thread.isAlive());
        thread.run();
        System.out.println(thread.isAlive());


    }
}
