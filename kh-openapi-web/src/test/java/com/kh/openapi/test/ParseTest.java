package com.kh.openapi.test;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.junit.Test;
import org.testng.collections.Maps;

import java.util.List;
import java.util.Map;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 23:11 2017/11/12
 */
public class ParseTest extends BaseTest {

    @Test
    public void parse(){

        Map<Object, Object> map = Maps.newHashMap();

        //String s = "<xml><appid><![CDATA[wxdace645e0bc2c424]]></appid><attach><![CDATA[bank_mch_name=浓浓&bank_mch_id=20170731145152029067]]></attach><bank_type><![CDATA[CFT]]></bank_type><cash_fee><![CDATA[1]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[N]]></is_subscribe><mch_id><![CDATA[1900008881]]></mch_id><nonce_str><![CDATA[1aNbnUMWIMyX7PrJ]]></nonce_str><openid><![CDATA[o4GgauH9hVFL8FoaUvpRIw2qSa1o]]></openid><out_trade_no><![CDATA[2017082216424801339825784858]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[0B35B4BC49D689D4DD0E556B78A3D12D]]></sign><sub_mch_id><![CDATA[26817196]]></sub_mch_id><time_end><![CDATA[20170822164349]]></time_end><total_fee>1</total_fee><trade_type><![CDATA[NATIVE]]></trade_type><transaction_id><![CDATA[4008762001201708227642961249]]></transaction_id></xml>\n" ;
        String s = "<xml><a><b><![CDATA[123]]></b></a></xml>";
        try {
            Document document = DocumentHelper.parseText(s);
            Element root = document.getRootElement();

            List elements = root.elements();

            for (int i = 0; i < elements.size() ; i++) {
                Element element = (Element) elements.get(i);
                Element b = element.element("b");
                map.put(b.getName(), b.getTextTrim());
            }

        } catch (DocumentException e) {
            e.printStackTrace();
        }

        System.out.println(map.get("b"));
    }
}
