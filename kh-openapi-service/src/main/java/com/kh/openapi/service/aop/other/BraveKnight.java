package com.kh.openapi.service.aop.other;

import org.springframework.stereotype.Component;

/**
 * 所在的包名: com.kh.openapi.service.aop.other
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 19:23 2018/1/18
 */
@Component("knight")
public class BraveKnight {

    public void saying(){
         System.out.println("我是骑士..（切点方法）");
    }
}
