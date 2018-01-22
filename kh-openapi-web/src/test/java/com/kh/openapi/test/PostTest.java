package com.kh.openapi.test;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.google.common.collect.Sets;
import com.kh.openapi.common.utils.HttpUtil;
import com.kh.openapi.common.utils.PingYinUtil;
import com.kh.openapi.common.utils.ResourceUtil;
import com.kh.openapi.common.utils.SpringUtils;
import com.kh.openapi.dao.LpApiListMapperExt;
import com.kh.openapi.facade.IApiControllerService;
import com.kh.openapi.model.LpApiList;
import com.kh.openapi.model.User;
import org.junit.Test;
import org.testng.collections.Maps;

import javax.annotation.Resource;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 19:45 2017/12/2
 */
public class PostTest extends BaseTest {

    @Resource
    private LpApiListMapperExt apiListMapperExt;


    //private final String method = "fshows.liquidation.submerchant.alipay.trade.precreate";	    //支付宝－扫码支付接口
    //private final String method = "fshows.liquidation.submerchant.alipay.trade.pay";	            //支付宝－刷卡支付接口
    private final String method = "fshows.liquidation.submerchant.query";	                        //商户查询接口
    //private final String method = "fshows.liquidation.alipay.trade.query";	                    //支付宝－订单查询接口
    //private final String method = "fshows.liquidation.submerchant.bank.bind";	                    //帐户绑定接口
    //private final String method = "fshows.liquidation.wx.trade.precreate";	                    //微信扫码接口
    //private final String method = "fshows.liquidation.wx.trade.pay";	                            //微信刷卡接口
    //private final String method = "fshows.liquidation.wxpay.mppay";	                            //微信公众号/微信小程序支付接口
    //private final String method = "fshows.liquidation.finance.downloadbill";	                    //对帐单接口
    //private final String method = "fshows.liquidation.submerchant.rate.set";	                    //设置商户终端费率接口
    //private final String method = "fshows.liquidation.submerchant.rate.query";	                //查询商户终端费率接口
    //private final String method = "fshows.liquidation.wxpay.apppay";	                            //微信APP支付接口
    //private final String method = "fshows.liquidation.jdpay.h5pay";	                            //京东H5支付接口
    //private final String method = "fshows.liquidation.submerchant.alipay.trade.create";	        //支付宝H5支付接口
    //private final String method = "fshows.liquidation.pay.refund";	                            //支付退款接口
    //private final String method = "fshows.liquidation.bestpay.h5pay";	                            //翼支付H5支付接口
    //private final String method = "fshows.liquidation.pay.refund.query";	                        //支付退款查询接口
    //private final String method = "fshows.liquidation.order.close";	                            //微信、支付宝订单关闭接口
    //private final String method = "fshows.liquidation.submerchant.create.with.auth";	            //商户入驻包含进件接口
    //private final String method = "fshows.liquidation.submerchant.authInfo.submit";	            //商户进件材料补充接口
    //private final String method = "fshows.liquidation.wxpay.mppay.sign";	                        //微信公众号唤起支付签名接口
    //private final String method = "fshows.liquidation.jdpay.h5pay.sign";	                        //京东H5支付签名接口
    //private final String method = "fshows.liquidation.jdpay.uniorder";	                        //京东统一下单接口
    //private final String method = "fshows.liquidation.order.reverse";	                            //支付宝、微信刷卡订单撤销接口
    //private final String method = "fshows.liquidation.wx.submerchant.create";	                    //微信子商户入驻接口
    //private final String method = "fshows.liquidation.wx.submerchant.config.create";	            //微信子商户配置新增接口
    //private final String method = "fshows.liquidation.wx.shop.query";	                            //微信门店查询接口
    //private final String method = "fshows.liquidation.wx.shop.audit.query";	                    //微信门店审核结果查询接口
    //private final String method = "fshows.liquidation.qiniu.file.token.create";                   //七牛文件token和key获取
    //private final String method = "fshows.liquidation.wx.shop.save";	                            //微信门店添加修改
    //private final String method = "fshows.liquidation.witness.account.create";	                //见证宝子账户创建接口
    //private final String method = "fshows.liquidation.wx.special.trade.precreate";	            //微信扫码特殊接口
    //private final String method = "fshows.liquidation.store.witness.bind.bank";	                //商户见证宝绑卡接口
    //private final String method = "fshows.liquidation.store.witness.bind.bank.verify.money";	    //商户见证宝验证鉴权金额接口
    //private final String method = "fshows.liquidation.witness.balance.query";	                    //见证宝可提现余额查询
    //private final String method = "fshows.liquidation.witness.withdraw";	                        //见证宝子账户提现接口
    //private final String method = "fshows.liquidation.witness.withdraw.query";	                //见证宝单笔提现查询
    //private final String method = "fshows.liquidation.witness.withdraw.query.list";	            //见证宝提现成功记录查询接口
    //private final String method = "fshows.liquidation.witness.parent.to.children";	            //见证宝登记挂账临时入口
    //private final String method = "fshows.liquidation.alipay.special.trade.precreate";            //支付宝－特殊扫码支付接口
    //private final String method = "fshows.liquidation.bestpay.merchant.account";	                //翼支付商户入驻接口
    //private final String method = "fshows.liquidation.qpay.add.merchant";	                        //QQ钱包商户入驻接口
    //private final String method = "fshows.liquidation.qpay.unified.order";	                    //QQ钱包-扫码支付接口
    //private final String method = "fshows.liquidation.wx.submerchant.create.supplement";	        //微信子商户入驻补充接口
    //private final String method = "fshows.liquidation.wx.submerchant.config.create.supplement";	//微信子商户配置新增补充接口
    //private final String method = "fshows.liquidation.wx.trade.h5pay";	                        //微信H5支付接口
    //private final String method = "fshows.liquidation.unionpay.add.merchant";                 	//银联扫码商户预注册接口
    //private final String method = "fshows.liquidation.unionpay.trade.precreate";                 	//银联扫码支付接口
    //private final String method = "fshows.liquidation.unionpay.trade.pay";	                    //银联刷卡支付接口
    //private final String method = "fshows.liquidation.wx.merchant.setting.query";	                //微信配置查询接口
    //private final String method = "fshows.liquidation.unionpay.query.merchant";	                //银联扫码商户信息查询
    //private final String method = "fshows.liquidation.merchant.create";                       	//商户入驻入驻清算平台接口
    //private final String method = "fshows.alipay.merchant.create";	                            //清算平台商户入驻支付宝接口
    //private final String method = "fshows.liquidation.jd.merchant.create";	                    //京东商户入驻接口
    //private final String method = "fshows.liquidation.store.witness.unbind.bank";             	//见证宝会员账户解绑接口
    //private final String method = "fshows.liquidation.store.witness.bind.bank.verify.message";    //见证宝银联鉴权短信接口

    //清算方名称:xukh
    String liquidatorId = "20170630091233203";
    private final String privateKey = ResourceUtil.getSystem("alipay.private.key.xukh");
    //清算方名称:xukh测试
    //String liquidatorId = "20171202195138813";
    //private final String privateKey = ResourceUtil.getSystem("alipay.private.key.xukh1");

    String url = "https://openapi-liquidation-test.51fubei.com/gateway"; //请求地址

    @Test
    public void queryMerchant() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<String, String> data = Maps.newHashMap();

        /*LpApiList apiList = apiListMapperExt.getApiList(method);

        String apiUrl = apiList.getApiUrl();
        String[] nameArray = apiUrl.split(",");
        String s = PingYinUtil.toLowerCaseFirstOne(nameArray[0]);
        Object orderService = SpringUtils.getBean(s);
        Method methods = orderService.getClass().getMethod(nameArray[1]);
        Object[] params = {};

        methods.invoke(orderService,params);*/

        Map<String, Object> content = assemblyParamsQueryMerchant();
        data.put("app_id", liquidatorId);
        data.put("method", method);
        data.put("version", "1.0");
        data.put("content", JSON.toJSONString(content));

        //加签
        addSign(data);

        //发送请求
        String result = sendPost(data);

        System.out.println(result);
    }

    public Map<String, Object> assemblyParamsJdMerchantCreate() {
        Map<String, Object> content = Maps.newHashMap();
        content.put("store_id", "20171116202306023891");
        content.put("business", "004");
        content.put("merchant_name", "(测试)商户名称");
        content.put("merchant_shortname", "(测试)商户简称");
        content.put("store_address", "(测试)商户地址");

        return content;
    }

    public Map<String,Object> assemblyParamsQueryMerchant(){
        Map<String, Object> content = Maps.newHashMap();
        content.put("s", "20170728101532026951");
        content.put("external_id", "XKH06230429150190000");

        return content;
    }

    public void addSign(Map<String, String> data) {
        //加签
        try {
            String sign = AlipaySignature.rsaSign(data, privateKey, "utf-8");
            data.put("sign", sign);
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
    }

    public String sendPost(Map<String, String> data) {
        try {
            String post = HttpUtil.post(url, null, data);

            return post;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "post请求发送失败";
    }

    public static void main(String[] args) {
        /*Object testService = SpringUtils.getBean("testService");

        System.out.println(testService.toString());
        Set set = Sets.newHashSet();

        User user = new User();
        user.setId(1);

        User user1 = new User();
        user1.setId(1);

        set.add(user);
        set.add(user1);

        System.out.println(set.size());*/
        System.out.println(111);

    }
}
