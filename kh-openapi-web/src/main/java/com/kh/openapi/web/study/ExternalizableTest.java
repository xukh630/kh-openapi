package com.kh.openapi.web.study;

import org.testng.collections.Lists;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 所在的包名: com.kh.openapi.web.study
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 22:13 2017/11/20
 */
public class ExternalizableTest implements Externalizable {

    private transient String content = "是的，我将会被序列化，不管我是否被transient关键字修饰";

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(content);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
         content = (String) in.readObject();
    }

    /*public static void main(String[] args) throws IOException, ClassNotFoundException {

        ExternalizableTest et = new ExternalizableTest();

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("test")));

        out.writeObject(et);

        ObjectInput in = new ObjectInputStream(new FileInputStream(new File("test")));

        et  = (ExternalizableTest) in.readObject();
        System.out.println(et.content);

        out.close();
        in.close();
    }*/

    public static void main(String[] args) {

        List<Object> list = Lists.newArrayList();

        ArrayList<Object> arr = new ArrayList<>();

        String s = new String();

        System.out.println(s.length());
    }

}
