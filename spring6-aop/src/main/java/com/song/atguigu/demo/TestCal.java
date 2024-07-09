package com.song.atguigu.demo;

import com.song.atguigu.aop.example.Calculator;
import com.song.atguigu.aop.example.impl.Calculatorimpl;
import com.song.atguigu.aop.example.impl.ProxyFactory;

public class TestCal {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Calculatorimpl());
        Calculator calculator = (Calculator) proxyFactory.getProxy();

        //calculator.add(1,2);

        calculator.mul(2,4);
    }
}
