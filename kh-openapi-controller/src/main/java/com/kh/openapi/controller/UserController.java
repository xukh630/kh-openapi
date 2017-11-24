package com.kh.openapi.controller;

import com.kh.openapi.common.result.ResultModle;
import com.kh.openapi.facade.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;


/**
 * 所在的包名: com.kh.openapi.controller
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 11:35 2017/11/22
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/add")
    public ResultModle add(){
        //userService.add()
        return null;
    }




}
