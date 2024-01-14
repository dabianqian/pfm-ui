package com.example.ketangpai.service.Impl;

import com.alibaba.fastjson.JSON;
import com.example.ketangpai.Mapper.UserMapper;
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


