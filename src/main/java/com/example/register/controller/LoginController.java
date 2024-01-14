package com.example.register.controller;

import com.example.register.service.Impl.UserOperateImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    public UserOperateImpl userOperate;


}


