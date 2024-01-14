package com.example.register.common;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.UUID;


public class JwtInterceptor {
    public static void main(String[] args){
        String token = createJWt();

    }
    private static long time = 1000 * 60 * 60 * 1;
    private static String sign = "admin";
 public static String createJWt(){
     JwtBuilder jwtBuilder = Jwts.builder();
     String jwtToken = jwtBuilder
             .setHeaderParam("typ","JWT")
             .setHeaderParam("alg","HS256")
             .claim("username","tom")
             .claim("role","admin")
             .setSubject("admin-test")
             .setExpiration(new Date(System.currentTimeMillis() * time))//token过期时间
             .setId(UUID.randomUUID().toString())//id字段
             .signWith(SignatureAlgorithm.HS256,sign)//签名
             .compact();
     return jwtToken;
 }
}


