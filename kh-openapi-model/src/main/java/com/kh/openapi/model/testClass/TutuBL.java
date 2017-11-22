package com.kh.openapi.model.testClass;

import com.kh.openapi.model.testInterface.ItutuBL;

/**
 * 所在的包名: com.kh.openapi.model.testClass
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 20:56 2017/11/13
 */
public class TutuBL implements ItutuBL {

    @Override
    public boolean chiFan(boolean hungry) {
        if (hungry) {
            System.out.println("吃饭");
            return true;
        }
        return false;
    }

    @Override
    public boolean shangWang(boolean silly) {
        if (silly) {
            System.out.println("打发时间,上网");
            return true;
        }
        return false;
    }
}
