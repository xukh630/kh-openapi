package com.kh.openapi.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * project: liquidator-platform-admin
 * package: com.fshows.liquidator.platform.admin.common.utils
 * todo: SHA加密算法
 * author: yanghao
 * date: 2017/7/20.
 */
public class EncryptSHAUtil {

    /**
     * SHA1加密
     * @param strText
     * @return
     */
    public static String SHA1(final String strText){
        return SHA(strText, "SHA-1");
    }

    /**
     * SHA256加密
     * @param strText
     * @return
     */
    public static String SHA256(final String strText){
        return SHA(strText, "SHA-256");
    }

    /**
     * SHA512加密
     * @param strText
     * @return
     */
    public static String SHA512(final String strText){
        return SHA(strText, "SHA-512");
    }

    /**
     * 字符串 SHA 加密
     *
     * @param strText
     * @return
     */
    private static String SHA(final String strText, final String strType)
    {
        // 返回值
        String strResult = null;

        // 是否是有效字符串
        if (strText != null && strText.length() > 0)
        {
            try
            {
                // SHA 加密开始
                // 创建加密对象 并傳入加密类型
                MessageDigest messageDigest = MessageDigest.getInstance(strType);
                // 传入要加密的字符串
                messageDigest.update(strText.getBytes());
                // 得到 byte 类型结果
                byte byteBuffer[] = messageDigest.digest();

                // 将 byte 转换为 string
                StringBuffer strHexString = new StringBuffer();
                // 遍历 byte buffer
                for (int i = 0; i < byteBuffer.length; i++)
                {
                    String hex = Integer.toHexString(0xff & byteBuffer[i]);
                    if (hex.length() == 1)
                    {
                        strHexString.append('0');
                    }
                    strHexString.append(hex);
                }
                // 得到返回結果
                strResult = strHexString.toString();
            }
            catch (NoSuchAlgorithmException e)
            {
                e.printStackTrace();
            }
        }

        return strResult;
    }

}
