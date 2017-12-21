package com.kh.openapi.test;

import com.kh.openapi.common.utils.DateUtil;
import org.junit.Test;

import java.math.BigDecimal;


/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:08 2017/12/12
 */
public class TimeTest extends BaseTest {

    @Test
    public void timeTest(){
        //System.out.println(111111);
        String nowDateFormat = DateUtil.getNowDateFormat();
        System.out.println(nowDateFormat);

        String specifiedDayAfter = DateUtil.getSpecifiedDayAfter(nowDateFormat);
        System.out.println(nowDateFormat);
        System.out.println(specifiedDayAfter);

        String s = "20171212";
        String s1 = DateUtil.getSpecifiedDayAfter(s);
        System.out.println(DateUtil.getSpecifiedDayAfter(s));
    }

    @Test
    public void bigdecimal(){
        BigDecimal a = new BigDecimal(5.00);

        BigDecimal b = new BigDecimal(8.00);

        BigDecimal c = new BigDecimal(2);

        BigDecimal bigDecimal = new BigDecimal(0.2);

        System.out.println(bigDecimal);

        System.out.println(a.divide(b));

        System.out.println(a.divide(c).setScale(2,BigDecimal.ROUND_HALF_UP));
    }

    public static void main(String[] args) {
        Long startTime = DateUtil.formatMillis("20171212","yyyyMMdd");

        long endTime = startTime + (24 * 60 * 60 - 1) * 1000;

        System.out.println(startTime);
        System.out.println(endTime);

        System.out.println(24*60*60);
    }

}
