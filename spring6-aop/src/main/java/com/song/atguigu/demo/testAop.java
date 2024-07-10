package com.song.atguigu.demo;

import com.song.atguigu.annotation.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAop {


    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(5,2);
    }
}
