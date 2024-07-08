package com.atguigu.demo;

import com.atguigu.reflect.Car;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class TestCar {

    //1. 获取 Class 对象多种方法
    @Test
    public void test01() throws Exception {
        //1 类名.class
        Class carClass1 = Car.class;

        //2 对象.getClass()
        Class carClass2 = new Car().getClass();

        //3 Class.forName(“全路径”)
        Class carClass3 = Class.forName("com.atguigu.reflect.Car");

        //对象实例化
        Car car = (Car) carClass3.getDeclaredConstructor().newInstance();

        System.out.println(car);

    }

    @Test
    //2.构造方法
    public void test02() throws Exception {
        Class clazz = Car.class;

        //getConstructors() 获取所有public的构造方法
        //Constructor[] constructors = clazz.getConstructors();

        //getDeclaredConstructors() 获取所有的构造方法 包含public 和private
        Constructor[] constructors = clazz.getDeclaredConstructors();

        for (Constructor c : constructors){
            System.out.println("方法名称: "+c.getName() + "\t 参数个数:" + c.getParameterCount());
        }
    }

    //3.获取属性

    //4.获取方法
}
