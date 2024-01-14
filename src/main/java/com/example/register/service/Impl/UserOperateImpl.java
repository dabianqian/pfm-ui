package com.example.register.service.Impl;

import com.example.register.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;


@Component
public class UserOperateImpl {

    @Autowired
    public UserMapper userMapper;

    public static UserOperateImpl userOperate;
    @PostConstruct
    public void init() {
        userOperate = this;
        userOperate.userMapper = this.userMapper;
    }

}


