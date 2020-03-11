package com.zy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.zy.mapper") //扫描包 注意用tk包下的
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
} 