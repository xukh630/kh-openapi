package com.kh.openapi.controller;

import com.kh.openapi.common.utils.DateUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

/**
 * 所在的包名: com.kh.openapi.controller
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 14:47 2017/11/15
 */
@RestController
@RequestMapping("/file")
public class FileController {

    @RequestMapping("/parseTxt")
    public void parseTxt(){
        File file = new File("E:/BankCode.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = null;

            while((line = br.readLine()) != null){
                String[] split = line.split("&");
                System.out.println(split.length);
            }

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
