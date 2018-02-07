package com.kh.openapi.model.constructor;

/**
 * 所在的包名: com.kh.openapi.model.constructor
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 14:35 2018/2/6
 */
public class Family {

    private Person person;

    private String familyName;

    public Family(Person person, String familyName) {
        this.person = person;
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Family{" +
                "person=" + person +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
