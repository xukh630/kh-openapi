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
public class CircleB {

    private CircleA circleA;

    public CircleB() {
        System.out.println("constrctor of B");
    }

    public CircleB(CircleA circleA) {
        System.out.println("constrctor of B A="+circleA);
        this.circleA = circleA;
    }
}
