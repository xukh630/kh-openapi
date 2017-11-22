package com.kh.openapi.web.study;

import com.kh.openapi.common.utils.DateUtil;
import org.apache.tools.ant.util.DateUtils;
import org.testng.collections.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 所在的包名: com.kh.openapi.web.study
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 21:46 2017/11/20
 */
public class Collection implements java.util.Collection{

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(java.util.Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(java.util.Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(java.util.Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(java.util.Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        long now1 = DateUtil.getNow();
        System.out.println(now1);

        for (int i = 0; i < 100000 ; i ++) {
            list.add(i);
        }


        long now2 = DateUtil.getNow();
        System.out.println(now2);
        System.out.println(now2 - now1);

        list.clear();

        for (int i = 0 ; i < 100000 ; i ++) {
            list.add(0,i);
        }

        long now3 = DateUtil.getNow();
        System.out.println(now3);
        System.out.println(now3 - now2);

        LinkedList<Object> linkedList = new LinkedList<>();

    }


    public static void makeList1(List<Integer> list,int n){
        list.clear();

        for (int i = 0 ; i < n ; i ++) {
            list.add(i);
        }
    }

    public static void makeList2(List<Integer> list ,int n) {
        list.clear();

        for (int i = 0 ; i < n ; i++) {
            list.add(0,i);
        }
    }


}
