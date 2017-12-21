package com.kh.openapi.test;

import com.kh.openapi.common.utils.PingYinUtil;
import com.kh.openapi.common.utils.SpringUtils;
import org.junit.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:14 2017/11/11
 */
public class InvokeTest extends BaseTest{

    private static ConfigurableListableBeanFactory beanFactory;

    @Test
    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String apiUrl = "testService,a";
        String[] nameArray = apiUrl.split(",");
        String s = PingYinUtil.toLowerCaseFirstOne(nameArray[0]);
        Object orderService = SpringUtils.getBean(s);
        Method method = orderService.getClass().getMethod(nameArray[1]);
        Object[] params = {};

        method.invoke(orderService,params);
    }

    @Test
    public void invokeTest() throws Exception{
        String apiUrl = "testService,a";
        String name = "testService";
        String methodName = "invokeA";

        String s = PingYinUtil.toLowerCaseFirstOne(name);
        Object orderService = SpringUtils.getBean(s);
        Method method = orderService.getClass().getMethod(methodName,String.class);

        method.invoke(orderService,"abcdefg");
    }

}
