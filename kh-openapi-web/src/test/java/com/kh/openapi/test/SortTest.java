package com.kh.openapi.test;

import net.sf.jsqlparser.expression.AnyType;

import java.util.HashMap;
import java.util.Map;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 19:50 2017/11/24
 */
public class SortTest {

    public static <AnyType extends Comparable< ? super AnyType>> void shellsort(AnyType [] a ) {
        int j;

        for (int gap  = a.length/2;gap > 0; gap/=2) {

            for (int i = gap; i < a.length;i++ ) {
                AnyType tmp = a[i];
                for (j = i; j >= gap && tmp.compareTo(a[j - gap]) < 0; j -= gap) {
                    a[j] = a[j - gap];
                    a[j] = tmp;
                }
            }
        }
    }

    public static void shellsort(int [] a) {
        int j;

        for (int gap  = a.length/2;gap > 0; gap/=2) {

            for (int i = gap; i < a.length;i++ ) {
                int tmp = a[i];
                for (j = i; j >= gap && tmp - (a[j - gap]) < 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = tmp;
                print(a);
            }
        }
    }


    public static void main(String[] args) {
        String s = "https://openapi-liquidation-test.51fubei.com/test/h5?url=https://wx.tenpay.com/cgi-bin/mmpayweb-bin/checkmweb?prepay_id=wx20171130115357c7268e22740737344961&package=3999450792";
        String[] split = s.split("&");
        System.out.println(split[split.length -1 ]);
        System.out.println(split[0]);
    }

    public static void print(int[] ints ){
        Map.Entry entry = new Map.Entry<Object, Object>() {
            @Override
            public Object getKey() {
                return null;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object setValue(Object value) {
                return null;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };
    }


}
