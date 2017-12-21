package com.kh.openapi.model.from;

/**
 * 所在的包名: com.kh.openapi.model.from
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 21:26 2017/12/2
 */
public class QueryMerchantForm {

    private String storeId;

    private String liquidatorStoreId;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getLiquidatorStoreId() {
        return liquidatorStoreId;
    }

    public void setLiquidatorStoreId(String liquidatorStoreId) {
        this.liquidatorStoreId = liquidatorStoreId;
    }
}
