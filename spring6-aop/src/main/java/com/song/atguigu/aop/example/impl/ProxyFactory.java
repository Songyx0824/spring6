package com.song.atguigu.aop.example.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //动态返回代理对象
    public Object getProxy(){
        /**
         * Proxy.newProxyInstance() 三个参数
         * 1. ClassLoader  加载动态生成代理类的来加载器
         * 2. Class[]  木匾对象实现所有接口的 class类型数组
         * 3. InvocationHandler 设置代理对象实现木匾对象方法的过程
         */

        ClassLoader classLoader = target.getClass().getClassLoader();

        Class<?>[] interfaces = target.getClass().getInterfaces();

        InvocationHandler invocationHandler = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理"+ method.getName() + ", 参数: "+ Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("动态代理"+ method.getName() + ", 结果: "+ result );
                return result;
            }
        };

        Object object = Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
        return object;
    }
}
