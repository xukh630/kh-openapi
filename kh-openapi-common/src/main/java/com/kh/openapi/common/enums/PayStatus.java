package com.kh.openapi.common.enums;

/**
 * 项目：liquidator-platform-openapi
 * 包名：com.fshows.liquidator.platform.openapi.common.enums
 * 功能：支付状态
 * 时间：2016-08-09 15:45
 * 作者：Mr.Kiwi
 */
public enum PayStatus {


    NO_PAY(0,"未支付"),
    PAY_SUCCESS(1,"支付成功"),
    PAY_FAILER(2,"支付失败"),
    REFUND_PROCESSING(3,"退款中"),
    REFUND_SUCCESS(4,"退款成功"),
    REFUND_FAILER(5,"退款失败"),
    ORDER_CLOSE(6,"订单关闭"),
    ORDER_REVERSE(7,"订单撤销");

    private int value = 0;
    private String description;

    PayStatus(int value,String description) {
        this.value = value;
        this.description = description;
    }

    public static PayStatus valueOf(int value){ // 手写的从int到enum的转换函数
//        switch(value) {
//            case 0:
//                return NO_PAY;
//            case 1:
//                return PAY_SUCCESS;
//            case 2:
//                return PAY_FAILER;
//            case 3:
//                return REFUND_PROCESSING;
//            case 4:
//                return REFUND_SUCCESS;
//            case 5:
//                return REFUND_FAILER;
//            case 6:
//                return ORDER_CLOSE;
//            case 7:
//                return ORDER_REVERSE;
//            default:
//                return NO_PAY;
//        }
        for (PayStatus payStatus : values()) {
            if (value == payStatus.value()) {
                return payStatus;
            }
        }
        return NO_PAY;
    }

    public int value() {
        return this.value;
    }

    public String getDescription() {
        return description;
    }
}
