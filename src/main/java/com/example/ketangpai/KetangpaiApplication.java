package com.example.ketangpai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ketangpai.mapper")
public class KetangpaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(KetangpaiApplication.class, args);
    }

}
