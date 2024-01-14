package com.example.ketangpai.Util;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class JwtUtil {
    public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                int y = n;
                int c = 0;
                int max = 0;
                int m = 0;
                while (n != 0) {
                    m++;
                    if (y == n)
                        c++;
                    else {
                        if (c > max)
                            max = c;
                        c = 1;
                        if (m == 10000)
                            System.gc();
                    }
                    y = n;
                    n = input.nextInt();
                }
                if (c > max)
                    max = c;
                System.out.println(max);
        }
    private static long time = 1000 * 10;
    private static String sign = "admin";
//    public static String createJWt(User user){
//        JwtBuilder jwtBuilder = Jwts.builder();
//        String jwtToken = jwtBuilder
//                .setHeaderParam("typ","JWT")
//                .setHeaderParam("alg","HS256")
//                .claim("user",user.user)
//                .claim("password",user.password)
//                .setSubject("admin-test")
//                .setExpiration(new Date(System.currentTimeMillis() * time))//token过期时间
//                .setId(UUID.randomUUID().toString())//id字段
//                .signWith(SignatureAlgorithm.HS256,sign)//签名
//                .compact();
//        return jwtToken;
//    }
}


