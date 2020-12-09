package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalTime;

@Data
@TableName("user")
public class User {

    private Integer id;

    private String name;

    private String phone;

    private String email;

    private String createTime;

    private String birthday;

}
