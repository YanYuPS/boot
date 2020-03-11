package com.zy.controller;

import com.zy.pojo.User;
import com.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User queryById(@PathVariable Long id){
        return userService.queryById(id);
    }


}
