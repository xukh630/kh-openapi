package com.kh.openapi.model.constructor;

/**
 * 所在的包名: com.kh.openapi.model.constructor
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 14:33 2018/2/6
 */
public class Person {

    private String personName;

    private int personAge;

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    @Override
    public String  toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personAge=" + personAge +
                '}';
    }
}
