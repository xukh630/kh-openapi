/**
 * Copyright (c) 2016, 791650277@qq.com(Mr.kiwi) All Rights Reserved.
 */
package com.kh.openapi.common.enums;

/**
 * 项目：liquidator-platform-openapi
 * 包名：com.fshows.liquidator.platform.openapi.common.enums
 * 功能：支付类型
 * 时间：2016-08-09 13:59
 * 作者：Mr.Kiwi
 */
public enum  PayType {


    SCAN_PAY(1),  // 刷卡
    QR_PAY(2),    // 扫刷(扫码)
    JS_PAY(3),   //线上支付
    APP_PAY(4),  //app支付
    XCX_PAY(5),  //小程序支付
    H5_PAY(6);   //H5支付

    private int value = 0;

    PayType(int value) {

        this.value = value;
    }

    public static PayType valueOf(int value){ // 手写的从int到enum的转换函数
        switch(value) {
            case 1:
                return SCAN_PAY;
            case 2:
                return QR_PAY;
            case 3:
                return JS_PAY;
            case 4:
                return APP_PAY;
            case 5:
                return XCX_PAY;
            case 6:
                return H5_PAY;
            default:
                return SCAN_PAY;
        }
    }

    public int value() {
        return this.value;
    }


}
