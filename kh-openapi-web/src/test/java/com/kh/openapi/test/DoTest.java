package com.kh.openapi.test;

import com.kh.openapi.common.utils.BigDecimalUtil;
import com.kh.openapi.common.utils.DateUtil;
import com.kh.openapi.common.utils.JsonUtil;
import com.kh.openapi.model.User;
import com.kh.openapi.model.testClass.IsBlank;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.joda.time.DateTime;
import org.junit.Test;
import org.testng.collections.Lists;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 17:22 2017/12/21
 */
public class DoTest extends BaseTest {

    @Test
    public void test(){
        String s = new String("aaa");
        User user = new User();

        List<Object> list = Lists.newArrayList();
        list.add("11");
        int i = list.hashCode();
        System.out.println(i);
    }

    @Test
    public void random(){
        String s = "12377777777777777788";
        long l = Long.parseLong(s);
        System.out.println(l);


    }

    @Test
    public void list(){
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> list1 = new ArrayList<>();

        for (int i=0;i<10;i++) {
            list.add(i);
        }

        list.add(10);
        list.add(11);

        System.out.println("-------------" + list.size());
        list.trimToSize();
        System.out.println("-------------" + list.size());
        System.out.println(list.size() +"  " + list1.size());

        Object[] o = new Object[4] ;
        Object[] o1 = new Object[]{1,4,3,4,5};
        Object[] objects1 = Arrays.copyOf(o1, 3);

        for (int i=0;i<objects1.length;i++) {
            System.out.println(objects1[i]);
        }
        Object[] objects = Arrays.copyOf(o, 2);
        System.out.println(objects.length);
        System.out.println(2>>1);
    }

    //assert关键字
    @Test
    public void ass(){
        System.out.println(111);
        assert 1> 2;
        System.out.println(222);
    }

    @Test
    public void move(){
        System.out.println(15>>1);
    }

    @Test
    public void time(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HHmmss");
        String time = format.format(date);
        System.out.println(time);
    }

    @Test
    public void subtract(){
        BigDecimal a = new BigDecimal(444.61).setScale(2,BigDecimal.ROUND_HALF_UP);
        BigDecimal b = new BigDecimal(111.45).setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(a.subtract(b));
    }

    @Test
    public void add(){
        BigDecimal a = new BigDecimal(333.16).setScale(2, BigDecimal.ROUND_HALF_UP);
        BigDecimal b = new BigDecimal(305.77).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(a.subtract(b));
    }

    @Test
    public void isBlank(){
        IsBlank isBlank = new IsBlank();
        BigDecimal bigDecimal = isBlank.getBigDecimal();
        String zero = new BigDecimal("0").setScale(2,BigDecimal.ROUND_HALF_UP).toString();
        String s = isBlank.getBigDecimal() == null ? zero : isBlank.getBigDecimal().toString();
        System.out.println(s);
    }

    @Test
    public void randomNum(){
        System.out.println(RandomStringUtils.randomNumeric(12));
        String fileName = "Bat3220201801021000000017.txt";
        String downloadFileName ="BatReturn" + fileName.substring(3,25);
        System.out.println(fileName);
        System.out.println(downloadFileName);
    }

    @Test
    public void divide(){
        BigDecimal ten = BigDecimal.TEN;
        BigDecimal ten1 = BigDecimal.TEN;
        BigDecimal divide = ten.subtract(ten1);
        System.out.println(divide);
    }

    @Test
    public void toDate(){
        //System.out.println(DateUtil.toDate(DateUtil.getNowDateStr(),"yyyy-MM-dd HH:mm:ss"));

        System.out.println(new Date());
        Date date = new Date();
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddE HH:mm:ss");
        String format = sdf.format(date);

        System.out.println(DateUtil.formatDateString(1515243182346l));
    }

    @Test
    public void json(){
        String s = "success";
        System.out.println(JsonUtil.toJsonString(s));
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);
    }

    @Test
    public void BigDecimal(){
        BigDecimal ten = BigDecimal.TEN;
        BigDecimal one = BigDecimal.ONE;
        BigDecimal two = new BigDecimal(2);
        BigDecimal subtract = BigDecimalUtil.subtract(ten, one);
        BigDecimal divide = BigDecimalUtil.divide(ten,two,2);
        System.out.println(subtract);
        System.out.println(divide);
    }

    @Test
    public void pattern(){
        String s = "浙江省温州市永嘉县岩头镇芙蓉新村15栋";
        String regex = "(.*省)|(.*市)|(.*[区|县])";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    public void timeMills(){
        long now = DateUtil.getNow();
        System.out.println(now);
        String nowDate = DateUtil.getNowDateStr();
        System.out.println(nowDate);

        long yyyyMMdd = DateUtil.formatMillis(nowDate, "yyyyMMdd");
        System.out.println(yyyyMMdd);

    }

    @Test
    public void dian(){
        ReentrantLock lock = new ReentrantLock();

        DateTime dateTime = DateTime.now().withHourOfDay(23).withMinuteOfHour(50);

        System.out.println(dateTime);
    }

    @Test
    public void setNotRepeat() {
        Set<String> set = new HashSet<>();

        set.add("1");
        System.out.println(set.size());
        set.add("2");
        System.out.println(set.size());
        set.add("3");
        System.out.println(set.size());
        set.add("4");
        System.out.println(set.size());
        set.add("1");
        System.out.println(set.size());
    }
























}
