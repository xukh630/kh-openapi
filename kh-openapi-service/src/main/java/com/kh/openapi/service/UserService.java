package com.kh.openapi.service;

import com.kh.openapi.dao.UserMapperExt;
import com.kh.openapi.facade.IUserService;
import com.kh.openapi.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 所在的包名: com.kh.openapi.service
 * 所在的项目名：kh-openapi
 *
 * @Author:xukh
 * @Description:
 * @Date: Created in 21:55 2017/11/22
 */
@Service
public class UserService implements IUserService {

    @Resource
    private UserMapperExt userMapperExt;

    @Override
    public Integer add(User user) {
        return userMapperExt.insertSelective(user);
    }
}
