package com.kh.openapi.model.designMode.desker;

/**
 * 所在的包名: com.kh.openapi.model.designMode.desker
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:   一般打印方法
 * @Date: Created in 16:39 2018/2/25
 */
public class CommonImpl {

    private DesignDaoImpl dao = new DesignDaoImpl();

    public void insert (){
        System.out.println(System.currentTimeMillis());
        dao.insert();
        System.out.println(System.currentTimeMillis());
    }

    public void add(){
        dao.add();
    }

    public void update(){
        dao.update();
    }
}
