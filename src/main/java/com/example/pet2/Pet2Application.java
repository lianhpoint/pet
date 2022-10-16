package com.example.pet2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.pet2.mapper")
public class Pet2Application {

    public static void main(String[] args) {
        SpringApplication.run(Pet2Application.class, args);
    }

}
