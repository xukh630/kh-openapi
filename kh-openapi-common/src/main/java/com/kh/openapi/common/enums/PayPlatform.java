package com.kh.openapi.common.enums;

/**
 * 项目：liquidator-platform-openapi
 * 包名：com.fshows.liquidator.platform.openapi.common.enums
 * 功能：
 * 时间：2016-08-09 10:33
 * 作者：Mr.Kiwi
 */
public enum PayPlatform {

    ALIPAY(1), // 支付宝
    WX(2),     //微信
    JD(3),     //京东
    BESTPAY(4),//翼支付
    BANK(5),   //银行
    QPAY(6),   //QQ钱包
    UNIONPAY(7); //银联

    private int value = 0;

    PayPlatform(int value) {

        this.value = value;
    }

    public static PayPlatform valueOf(int value) { // 手写的从int到enum的转换函数
        switch (value) {
            case 1:
                return ALIPAY;
            case 2:
                return WX;
            case 3:
                return JD;
            case 4:
                return BESTPAY;
            case 5:
                return BANK;
            case 7:
                return UNIONPAY;
            default:
                return ALIPAY;
        }
    }

    public int value() {
        return this.value;
    }

}
