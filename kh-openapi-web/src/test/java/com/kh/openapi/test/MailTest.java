package com.kh.openapi.test;

import com.kh.openapi.common.utils.ResourceUtil;
import org.junit.Test;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;


import javax.annotation.Resource;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 14:03 2017/11/11
 */
public class MailTest extends BaseTest{

    @Resource(name = "mailSender")
    private JavaMailSenderImpl mailSender;

    @Test
    public void sendMail(){
        String[] sendTo = ResourceUtil.getSystem("mail.receiver").split(",");
        String from = ResourceUtil.getSystem("mail.smtp.username");
        String subject = "邮件测试";
        String text = "下班";

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mailSender.getUsername());
        message.setTo("136382646@qq.com");
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);

    }

    @Test
    public void souts(){
        System.out.println("1111111111");
    }
}
