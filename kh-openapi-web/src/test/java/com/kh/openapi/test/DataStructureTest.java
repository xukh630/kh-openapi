package com.kh.openapi.test;

import com.kh.openapi.common.utils.ResourceUtil;
import com.kh.openapi.model.testClass.Fu;
import com.kh.openapi.model.testClass.Zi;
import org.junit.Test;
import org.testng.collections.Lists;
import org.testng.collections.Maps;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 14:24 2017/11/28
 */
public class DataStructureTest extends BaseTest {


    @Test
    public void h1(){

        ArrayList<String> arrayList = new ArrayList<>();

        Map<String, String> rs = new HashMap<String, String>();

        Map<String , Object> map = Maps.newHashMap();

        Map<String, Object> map1 = new HashMap<String ,Object>();

        ConcurrentHashMap<Object, Object> map2 = new ConcurrentHashMap<>();

        Map<Object, Object> map4 = Maps.newHashMap();

        List<Object> list = Lists.newArrayList();


    }

    @Test
    public void resource(){
        String system = ResourceUtil.getSystem("jd.pay.model");
        System.out.println(system);
    }

    @Test
    public void hash(){
        String s = "1233";
        int i = s.hashCode() ^ 2;
        System.out.println(s.hashCode());
        System.out.println(i);

        System.out.println(1^2);//0001 0010  0011
        System.out.println(1^3);//0001 0011 0010
        System.out.println(2^3);//0010 0011 0001
        System.out.println(1^2^3);//0001 0010 0011-->0011  -->>0000

        Map<Object, Object> map = new HashMap<>();
        Map<Object, Object> map1 = Maps.newLinkedHashMap();
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.setName("你爸");
        fu.setAge("40");

        Zi zi = new Zi();
        zi.setName("儿子");
        zi.setAge("10");
        zi.setStatus("1");

        Fu fu1 = new Zi();
        fu1.setName("哒哒");
        fu1.setAge("100");
        fu1.go();
    }

}
