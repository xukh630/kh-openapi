package com.kh.openapi.common.enums;

import jdk.nashorn.internal.scripts.JD;

/**
 * 所在的包名: com.kh.openapi.common.enums
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 15:08 2017/11/28
 */
public enum  JdMerchantCreateErrors {

    ERR001(1,"merchantNo为空"),
    ERR002(2,"requestId为空"),
    ERR003(3,"sign为空"),
    ERR004(4,"data为空"),
    ERR005(5,"商户号不存在"),
    ERR006(6,"系统异常"),
    ERR007(7,"外部商户ID为空"),
    ERR008(8,"外部商户名称为空"),
    ERR009(9,"外部商户行业为空"),
    ERR010(10,"外部商户注册时间不正确"),
    ERR011(11,"外部商户地址为空"),
    ERR012(12,"sign签名错误"),
    SUCC001(01,"处理成功"),
    ERR013(13,"数据无法解密成功"),
    ERR017(17,"商户简称为空"),
    ERR018(18,"商户联系电话为空"),
    ERR019(19,"秘钥未配置或未生效"),
    ERR020(20,"商户未实名");

    private int value = 0;
    private String description;

    JdMerchantCreateErrors(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int value() {
        return this.value;
    }

    public String getDescription() {
        return description;
    }

    public static JdMerchantCreateErrors valueOf(int value) {
        for (JdMerchantCreateErrors errors : values()) {
            if (errors.value == value){
                return errors;
            }
        }
        return ERR006;
    }


    public static void main(String[] args) {

        JdMerchantCreateErrors err005 = ERR005;

        JdMerchantCreateErrors err006 = JdMerchantCreateErrors.ERR006;
        int value = err006.value;
        String description = err006.description;



        System.out.println(err006);
        System.out.println(value);
        System.out.println(description);

    }
}
