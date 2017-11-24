package com.kh.openapi.common.enums;

/**
 * 功能：lp_liquidator_rate pay_type 支付类型枚举
 * 时间：2017-01-02
 * 作者：呱牛
 */
public enum FeeRateType {

    ALIPAY_FACE_PAY(1,"支付宝当面付"),
    ALIPAY_APP_PAY(2,"支付宝APP支付"),
    WX_FACE_PAY(3,"微信当面付"),
    WX_APP_PAY(4,"微信APP支付"),
    JD_FACE_PAY(5,"京东当面付"),
    JD_APP_PAY(6,"京东APP支付"),
    BESTPAY_FACE_PAY(7,"翼支付当面付"),
    BESTPAY_APP_PAY(8,"翼支付APP支付"),
    WX_OASIS(9,"绿洲计划"),
    QQ_PAY(10,"QQ钱包"),
    UNION_PAY_DEBIT(12,"银联扫码（借记）"),
    UNION_PAY_CREDIT(13,"银联扫码（贷记）");

    private int value = 0;
    private String description;

    FeeRateType(int value,String description) {
        this.value = value;
        this.description = description;
    }

    public int value() {
        return this.value;
    }

    public String getDescription() {
        return description;
    }

    public static FeeRateType valueOf(int value) {
//        switch (value) {
//            case 1:
//                return ALIPAY_FACE_PAY;
//            case 2:
//                return ALIPAY_APP_PAY;
//            case 3:
//                return WX_FACE_PAY;
//            case 4:
//                return WX_APP_PAY;
//            case 5:
//                return JD_FACE_PAY;
//            case 6:
//                return JD_APP_PAY;
//            case 7:
//                return BESTPAY_FACE_PAY;
//            case 8:
//                return BESTPAY_APP_PAY;
//            default:
//                return ALIPAY_FACE_PAY;
//        }
        for (FeeRateType feeRateType : values()){
            if (feeRateType.value == value) {
                return feeRateType;
            }
        }
        return ALIPAY_FACE_PAY;
    }
}
