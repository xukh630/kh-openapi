package com.kh.openapi.service;

import com.kh.openapi.common.utils.DateUtil;

import com.kh.openapi.common.utils.ResourceUtil;
import com.kh.openapi.dao.UserMapperExt;
import com.kh.openapi.facade.ITestService;
import com.kh.openapi.model.User;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.joda.time.DateTime;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 所在的包名: com.kh.openapi.service
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 11:56 2017/10/12
 */
@Service
public class TestService implements ITestService {

    @Resource
    private UserMapperExt userMapperExt;
    @Resource
    private JavaMailSenderImpl mailSender;

    @Override
    public void sout() {
        System.out.println("+++++++++++++++++++++++");
    }

    @Override
    public void insert() {
        User user = new User();
        user.setUsername("徐楷洪");
        user.setPassword("123456");
        userMapperExt.insert(user);
    }

    @Override
    public void sendMail(String[] sendTo, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(mailSender.getUsername());
            message.setTo(sendTo);
            message.setSubject(subject);
            message.setText(text);

            mailSender.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    @Async
    public void async1() {
        System.out.println("async1");
    }

    @Override
    @Async
    public void async2() {
        System.out.println("async2");
    }

    public void a(){
        System.out.println("aaaaaaaa");
    }

    public void b(){
        System.out.println("bbbbbbbb");
    }

    public void invokeA(String s){
        System.out.println(s);
    }

    public void invokeB(String s,String a){
        System.out.println(s + a);
    }


    public static void main(String[] args) {
        String a = "20171231";

        String specifiedDayAfter = getSpecifiedDayAfter(a);

        System.out.println(specifiedDayAfter);


    }
    public static String getSpecifiedDayAfter(String specifiedDay){
        Calendar c = Calendar.getInstance();
        Date date=null;
        try {
            date = new SimpleDateFormat("yyyyMMdd").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date);
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DATE,day+1);
        String dayAfter=new SimpleDateFormat("yyyyMMdd").format(c.getTime());
        return dayAfter;
    }
}