package com.song.atguigu.aop.example.impl;

import com.song.atguigu.aop.example.Calculator;


/**
 * 静态代理
 */
public class CalculatorStaticProxy implements Calculator {

    private Calculator calculator ;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        return 0;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
