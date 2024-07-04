package com.song.atguigu.demo;

import com.song.atguigu.bean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ben.xml");

        UserDao userDao = context.getBean(UserDao.class);

        System.out.println(userDao);
    }
}
