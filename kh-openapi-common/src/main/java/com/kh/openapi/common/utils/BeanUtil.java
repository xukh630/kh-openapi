package com.kh.openapi.common.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目：unionpay-liquidation-openapi
 * 包名：com.fshows.unionpay.liquidation.openapi.util
 * 功能：
 * 时间：2017-03-22
 * 作者：呱牛
 */
public class BeanUtil {

    public static Object mapToBean(final Map<String, ? extends Object> map, Class<?> beanClass) throws Exception {
        if (map == null) {
            return null;
        }
        final Object obj = beanClass.newInstance();

        BeanUtils.populate(obj, map);

        return obj;
    }

    public static Map<String, Object> beanToMap(final Object obj) throws IllegalAccessException {
        if (obj == null) {
            return null;
        }
        final Map<String, Object> map = new HashMap<>();

        final Field[] declaredFields = obj.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }

        return map;
    }
}
