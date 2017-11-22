package com.kh.openapi.model.testClass;

/**
 * 所在的包名: com.kh.openapi.model.testClass
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 21:11 2017/11/13
 */
public class Tutu {

    private ViewPoint viewPoint;

    public ViewPoint getViewPoint() {
        return viewPoint;
    }

    public void setViewPoint(ViewPoint viewPoint) {
        this.viewPoint = viewPoint;
    }

    public void travelTo(){
        System.out.println("TUTU准备去旅游了");
        viewPoint.where();
    }
}
