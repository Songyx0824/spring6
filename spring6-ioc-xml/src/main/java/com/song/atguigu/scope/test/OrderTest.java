package com.song.atguigu.scope.test;

import com.song.atguigu.scope.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ben-scope.xml");

        Orders orders1 = context.getBean("orders", Orders.class);
        Orders orders2 = context.getBean("orders", Orders.class);

        System.out.println(orders1);
        System.out.println(orders2);
    }
}
