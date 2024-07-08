package com.song.atguigu.spring6.controller;


import com.song.atguigu.spring6.service.UserServiec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserServiec userServiecImpl;
}
