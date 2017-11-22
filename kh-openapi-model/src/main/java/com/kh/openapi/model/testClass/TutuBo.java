package com.kh.openapi.model.testClass;

import com.kh.openapi.model.testInterface.ItutuBo;

/**
 * 所在的包名: com.kh.openapi.model.testClass
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 20:55 2017/11/13
 */
public class TutuBo implements ItutuBo {

    private double height;

    private double weight;

    @Override
    public void setShengao(double height) {
        this.height = height;
    }

    @Override
    public double getShenggao() {

        return height;
    }

    @Override
    public void setTizhong(double weight) {
        this.weight = weight;
    }

    @Override
    public double getTizhong() {

        return weight;
    }
}
