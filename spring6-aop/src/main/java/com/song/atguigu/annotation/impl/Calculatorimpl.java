package com.song.atguigu.annotation.impl;

import com.song.atguigu.annotation.Calculator;
import org.springframework.stereotype.Component;

@Component
public class Calculatorimpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("内部方法 result = " + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("内部方法 result = " + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println("内部方法 result = " + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("内部方法 result = " + result);
        return result;
    }
}
