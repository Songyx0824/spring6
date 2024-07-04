package com.song.atguigu.demo;

import com.song.atguigu.bean.di.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("java","尚硅谷");
    }

    @Test
    public void testSetter(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ben-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testconstructor(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ben-di.xml");
        Book book = context.getBean("bookCon", Book.class);
        System.out.println(book);
    }
}
