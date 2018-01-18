package com.kh.openapi.model.testClass;

/**
 * 所在的包名: com.kh.openapi.model.testClass
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:55 2018/1/10
 */
public class Fu {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public void go(){
        System.out.println(this.name+""+this.age+"父类go");
    }
}
