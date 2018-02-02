package com.kh.openapi.model.loopAutowitre;

import org.springframework.stereotype.Component;

/**
 * 所在的包名: com.kh.openapi.service.loopAutowitre
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 17:03 2018/2/1
 */
@Component
public class CircleA {

    private CircleB circleB;

    public CircleA() {
        System.out.println("constrctor of A");
    }

    public CircleA(CircleB circleB) {
        System.out.println("constrctor of A a B="+circleB);
        this.circleB = circleB;
    }

    public CircleB getCircleB(){
        return this.circleB;
    }
}
