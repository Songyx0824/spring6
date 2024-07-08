package com.song.atguigu.spring6.dao.impl;


import com.song.atguigu.spring6.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("UserDao.....");
    }
}
