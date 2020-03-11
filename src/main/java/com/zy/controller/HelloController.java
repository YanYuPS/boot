package com.zy.controller;

import com.zy.config.JdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @Autowired
//    private JdbcConfig jdbcConfig;

    @GetMapping("/hello")
    public String hello(){
//        System.out.println(jdbcConfig.dataSource());
        return "hello, spring boot!";
    }

}
