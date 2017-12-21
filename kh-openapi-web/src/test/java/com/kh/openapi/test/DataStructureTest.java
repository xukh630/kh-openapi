package com.kh.openapi.test;

import com.kh.openapi.common.utils.ResourceUtil;
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
    }

    @Test
    public void resource(){
        String system = ResourceUtil.getSystem("jd.pay.model");
        System.out.println(system);
    }

}
