package com.kh.openapi.service;

import com.kh.openapi.common.enums.PayPlatform;
import com.kh.openapi.facade.IApiControllerService;
import org.joda.time.DateTime;
import org.testng.collections.Maps;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 所在的包名: com.kh.openapi.service
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 21:09 2017/12/2
 */
public class ApiControllerService implements IApiControllerService {

    @Override
    public Map<String, Object> merchantAlipayMerchantQueryController() {
        String subMerchantId = "20170728101532026951";
        String externalId = "XKH06230429150190000";

        Map<String, Object> content = Maps.newHashMap();
        content.put("sub_merchant_id", subMerchantId);
        content.put("external_id", externalId);

        return null;
    }


    public static void main(String[] args) {

        HashMap<Object, Object> map = new HashMap<>();

        Object put = map.put("1", 1);
        Object put1 = map.put("1", 2);

        System.out.println(put);
        System.out.println(put1);

    }
}
