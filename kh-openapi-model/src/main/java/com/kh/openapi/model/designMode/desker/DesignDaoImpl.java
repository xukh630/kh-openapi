package com.kh.openapi.model.designMode.desker;

/**
 * 所在的包名: com.kh.openapi.model.designMode.desker
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:34 2018/2/25
 */
public class DesignDaoImpl implements DesignDao {



    @Override
    public void add() {
        System.out.println(System.currentTimeMillis());
        System.out.println("this is add");
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public void insert() {
        System.out.println(System.currentTimeMillis());
        System.out.println("this is insert");
        System.out.println(System.currentTimeMillis());
    }

    @Override
    public void update() {
        System.out.println("this is update");
    }
}
