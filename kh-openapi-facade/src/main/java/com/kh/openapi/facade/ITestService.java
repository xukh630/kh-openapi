package com.kh.openapi.facade;

/**
 * @author xukh
 * @create 2017-10-12-11:56
 */
public interface ITestService {

    void sout();

    void insert();

    void sendMail(String[] sendTo, String subject, String text);

    void async1();

    void async2();

}
