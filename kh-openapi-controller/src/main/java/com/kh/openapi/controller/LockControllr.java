package com.kh.openapi.controller;

import com.kh.openapi.common.utils.DateUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 所在的包名: com.kh.openapi.controller
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 14:29 2018/1/18
 */
@RestController
@RequestMapping("/lock")
public class LockControllr {

    Lock lock = new ReentrantLock();

    @RequestMapping("/lock1")
    public void lock1() throws InterruptedException {
        lock.lock();
        System.out.println("start  lock1    " + DateUtil.getNow());
        Thread.sleep(5000);
        System.out.println("end lock1      " + DateUtil.getNow());
        lock.unlock();
        System.out.println("unlock lock1     " + DateUtil.getNow());
    }

    @RequestMapping("/lock2")
    public void lock2() throws InterruptedException {
        Thread.sleep(5000);

        lock.lock();
        System.out.println("lock2 lock     " + DateUtil.getNow());
    }
}
