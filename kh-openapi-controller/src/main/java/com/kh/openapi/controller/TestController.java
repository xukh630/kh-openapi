package com.kh.openapi.controller;

import com.github.pagehelper.StringUtil;
import com.kh.openapi.common.utils.PingYinUtil;
import com.kh.openapi.common.utils.ResourceUtil;
import com.kh.openapi.common.utils.SpringUtils;
import com.kh.openapi.facade.ITestService;
import com.kh.openapi.model.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sun.plugin2.message.Message;
import sun.plugin2.message.Serializer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 所在的包名: com.kh.openapi.controller
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 22:50 2017/10/7
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private ITestService testService;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public void sout(){
        testService.insert();
    }

    @RequestMapping("/mail")
    public void mail(){
        String[] name = ResourceUtil.getSystem("mail.smtp.username").split(",");
        testService.sendMail(name,"预警邮件","今天天气很好");
    }

    @RequestMapping("/invoke")
    public void invoke(String url) throws  Exception {
        String[] nameArray = url.split(",");
        String s = PingYinUtil.toLowerCaseFirstOne(nameArray[0]);
        Object orderService = SpringUtils.getBean(s);
        Method method = orderService.getClass().getMethod(nameArray[1]);
        Object[] params = {};

        method.invoke(orderService,params);
    }

    @RequestMapping("/async")
    public void asyn() throws InterruptedException {

        testService.async1();
        testService.async2();
        Thread.sleep(1000);
        System.out.println("finish");
    }

    /*public static void main(String[] args) {
        String s = "feedback_201711161140_mchnt_0001_20171116113508.txt";
        String a = "feedback_[\\d]{12}_mchnt_[\\d]{4}_[\\w]*.txt";

        final Pattern compile = Pattern.compile(a);
        final Matcher matcher = compile.matcher(s);
        final boolean matches = matcher.matches();

        System.out.println(StringUtils.equals(s,a));
        System.out.println(matches);

    }*/

    public static void main(String[] args) {
        int i = 0;
        User user = new User();

        i = user.getId();

    }

    @RequestMapping("/h5")
    public ModelAndView h5(@RequestParam String url,
                           @RequestParam(name = "package") String packages,
                           HttpServletRequest request, HttpServletResponse response) throws IOException {



        response.addHeader("Referer","openapi-liquidation-test.51fubei.com");
        request.setAttribute("url",url);
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        ModelMap modelMap = new ModelMap();
        modelMap.put("url",url);
        //modelMap.put("urls",split[0]);
        //modelMap.put("package",split[1]);


        return new ModelAndView("wxPay", modelMap);

    }

}
