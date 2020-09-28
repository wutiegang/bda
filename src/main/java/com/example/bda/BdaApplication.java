package com.example.bda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.bda.mapper")
@SpringBootApplication
public class BdaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdaApplication.class, args);
    }

}
