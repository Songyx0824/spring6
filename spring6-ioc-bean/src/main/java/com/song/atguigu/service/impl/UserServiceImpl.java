package com.song.atguigu.service.impl;

import com.song.atguigu.annotation.Ben;
import com.song.atguigu.annotation.Di;
import com.song.atguigu.dao.UserDao;
import com.song.atguigu.service.UserService;


@Ben
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;
}
