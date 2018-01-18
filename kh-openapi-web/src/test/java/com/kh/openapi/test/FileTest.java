package com.kh.openapi.test;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

import java.io.*;

/**
 * 所在的包名: com.kh.openapi.test
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 16:48 2017/12/23
 */
public class FileTest extends BaseTest {

    String CREATE_BATCH_ALLOCATE_TEMP_DIR = SystemUtils.getUserHome() +
            SystemUtils.FILE_SEPARATOR + "files" +
            SystemUtils.FILE_SEPARATOR + "upload" +
            SystemUtils.FILE_SEPARATOR + "temp" +
            SystemUtils.FILE_SEPARATOR + "liquidation-admin" +
            SystemUtils.FILE_SEPARATOR + "batch-allocate-create" +
            SystemUtils.FILE_SEPARATOR;

    @Test
    public void createTxt(){
        String filePath = CREATE_BATCH_ALLOCATE_TEMP_DIR;
        String fileName = "testTxt.txt";

        String content = "第一排" + "\n" + "第二排" +"\n" + "第三排" +"\n" + "第四排" +"\n" + "第五排" ;
        contentToTxts(filePath+fileName,content);
    }

    public void contentToTxt(String filePath, String content) {
        String str = new String(); //原有txt内容
        String s1 = new String();//内容更新
        try {
            File f = new File(filePath);
            if (f.exists()) {
                System.out.print("文件存在");
            } else {
                System.out.print("文件不存在");
                f.createNewFile();// 不存在则创建
            }
            BufferedReader input = new BufferedReader(new FileReader(f));

            while ((str = input.readLine()) != null) {
                s1 += str + "\n";
            }
            System.out.println(s1);
            input.close();
            s1 += content;

            BufferedWriter output = new BufferedWriter(new FileWriter(f));
            output.write(s1);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void contentToTxts(String filePath, String content) {
        String s1 = new String();//内容更新
        try {
            File f = new File(filePath);
            File parentFile = f.getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (!f.exists()) {
                f.createNewFile();
            }
            s1 += content;

            BufferedWriter output = new BufferedWriter(new FileWriter(f));
            output.write(s1);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }



}
