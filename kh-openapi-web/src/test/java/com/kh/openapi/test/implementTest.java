package com.kh.openapi.test;

import com.kh.openapi.model.testClass.LiJiang;
import com.kh.openapi.model.testClass.Tutu;
import com.kh.openapi.model.testClass.TutuBo;
import com.kh.openapi.model.testClass.ZhangJiaJie;
import org.junit.Test;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 21:01 2017/11/13
 */
public class implementTest extends BaseTest{

    @Test
    public void test(){
        TutuBo tutuBo = new TutuBo();
        tutuBo.setShengao(new Double(1.7));
    }

    public static void main(String[] args) {
        Tutu tutu = new Tutu();
        tutu.setViewPoint(new ZhangJiaJie());
        tutu.travelTo();
    }
}
