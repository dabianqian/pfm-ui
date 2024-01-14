package com.example.ketangpai.service.Impl;

import com.alibaba.fastjson.JSON;
import com.example.ketangpai.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;

import static com.example.ketangpai.Util.JwtUtil.createJWt;

@Component
public class UserOperateImpl implements UserOperate {

    @Autowired
    public UserMapper userMapper;

    public static UserOperateImpl userOperate;
    @PostConstruct
    public void init() {
        userOperate = this;
        userOperate.userMapper = this.userMapper;
    }
    public  String addUser(User user){
     User user1 = userOperate.userMapper.query(user);
     if (user1 != null){
         return "false";
     }else {
          Integer i = userOperate.userMapper.add(user);
          return "true";
     }
    }
    public String login(User user){
        System.out.println(user);
        User user1 = userOperate.userMapper.query(user);
        if (user1 == null){
            return JSON.toJSONString("null");
        }else if(user.password.equals(user1.password)){
            user1.token = createJWt(user);
            System.out.println(user1);
            return JSON.toJSONString(user1);
        }else {
            return JSON.toJSONString("false");
        }
    }
    public String getData(User user){
//        if (user.token == null || user.token == ""){
//            return "false";
//        }
//        try {
//            Jws<Claims> claimsJws = Jwts.parser().setSigningKey("admin").parseClaimsJws(user.token);
            User user1 = userOperate.userMapper.query(user);
            user1.password = "";
//            user1.token = createJWt(user);
            return JSON.toJSONString(user1);
//        }catch (ExpiredJwtException e){
//            return "false";
//        }
    }
}


