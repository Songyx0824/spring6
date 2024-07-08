package com.song.atguigu.spring6.service.impl;


import com.song.atguigu.spring6.dao.UserDao;
import com.song.atguigu.spring6.service.UserServiec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiec {

    @Autowired
    private UserDao userDaoImpl;

    @Override
    public void add() {
        System.out.println("UserDao.....");

    }
}
