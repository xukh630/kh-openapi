package com.kh.openapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 所在的包名: com.kh.openapi.controller
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 15:27 2018/1/8
 */
@RestController
@RequestMapping("/post")
public class PostController {

    @RequestMapping("/message")
    public String message(@RequestParam("username") String username,
                        @RequestParam("password") String password){


        return username+password;
    }
}
