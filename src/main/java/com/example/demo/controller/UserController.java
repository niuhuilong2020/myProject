package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getUser")
    public User getUser(Integer id){
        User user = userService.getById(id);
        return user;
    }

    @GetMapping("/saveUser")
    public void saveUser(){
        User user = new User();
        user.setId(3);
        user.setPhone("15511083043");
        user.setEmail("15511083043@163.com");
        user.setName("牛会龙");
        user.setBirthday("1993-01-03");
        user.setCreateTime("2020-11-30");
        userService.save(user);
    }

    @GetMapping("/getUser{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getById(id);
    }
}
