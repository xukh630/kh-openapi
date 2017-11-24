package com.kh.openapi.common.enums;

/**
 * 项目：liquidator-platform-openapi
 * 包名：com.fshows.liquidator.platform.openapi.common.enums
 * 功能：对账单接口文件类型
 * 时间：2017-01-03 15:18
 * 作者：Mr.Kiwi
 */
public enum FileType {

    PAY_REFUND_FILE(0),   // 支付退款订单
    PAY_SUCCESS_FILE(1),  // 支付成功订单
    BACK_DISK_FILE(2);    // 银行回盘文件

    private int value = 0;

    FileType(int value) {

        this.value = value;
    }

    public static FileType valueOf(int value) { // 手写的从int到enum的转换函数
        switch (value) {
            case 0:
                return PAY_REFUND_FILE;
            case 1:
                return PAY_SUCCESS_FILE;
            case 2:
                return BACK_DISK_FILE;
            default:
                return PAY_SUCCESS_FILE;
        }
    }

    public int value() {
        return this.value;
    }

}
