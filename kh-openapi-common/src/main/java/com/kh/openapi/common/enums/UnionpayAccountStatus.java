package com.kh.openapi.common.enums;

/**
 * project: liquidator-platform-admin
 * package: com.fshows.liquidator.platform.admin.common.enums
 * todo:
 * author: yanghao
 * date: 2017/11/4.
 */
public enum UnionpayAccountStatus {

    //0.关闭 1.开启 2.未审核 3.审核不通过
    CLOSE(0),
    OPEN(1),
    NO_CHECK(2),
    FAIL_CHECK(3);

    private int value = 0;

    UnionpayAccountStatus(int value) {

        this.value = value;
    }

    public int value() {
        return this.value;
    }

}
