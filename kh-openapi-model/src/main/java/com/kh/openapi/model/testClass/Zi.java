package com.kh.openapi.model.testClass;

/**
 * 所在的包名: com.kh.openapi.model.testClass
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:56 2018/1/10
 */
public class Zi extends Fu{
    private String name ;
    private String age;
    private String status;


    @Override
    public void go(){
        System.out.println(this.getName()+" "+ this.getAge()+" "+"子类go");
    }

    public void run(){
        System.out.println(this.getName()+" "+ this.getAge()+" "+"子类run");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
