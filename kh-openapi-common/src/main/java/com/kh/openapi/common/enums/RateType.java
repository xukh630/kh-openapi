package com.kh.openapi.common.enums;

/**
 * 项目：liquidator-platform-openapi
 * 包名：com.fshows.liquidator.platform.openapi.common.enums
 * 功能：
 * 时间：2017-06-08 10:29
 * 作者：Mr.Kiwi
 */
public enum RateType {

    ALIPAY(1),
    WX(2),
    WX_APP(3),
    BEST(4),
    JD(5),
    OASIS(6),
    WX_H5(7),
    QPAY(10),  //QQ钱包
    UNIONPAY_DEBIT(12),  //银联（借记）
    UNIONPAY_CREDIT(13); //银联（贷记）

    private int value = 0;

    RateType(int value) {

        this.value = value;
    }

    public static RateType valueOf(int value){ // 手写的从int到enum的转换函数
        switch(value) {
            case 1:
                return ALIPAY;
            case 2:
                return WX;
            case 3:
                return WX_APP;
            case 4:
                return BEST;
            case 5:
                return JD;
            case 6:
                return OASIS;
            default:
                return WX;
        }
    }

    public int value() {
        return this.value;
    }

}
