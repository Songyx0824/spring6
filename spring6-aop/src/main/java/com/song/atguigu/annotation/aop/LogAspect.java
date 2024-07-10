package com.song.atguigu.annotation.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {

    //设置切入点和通知类型
    //通知类型:
    // 切入点表达式: execution (访问修饰符(public) 方法返回类型(int void * deng ) 增强方法的全路径.方法名称(方法参数列表) )
    // 前置 @Before(value = "切入点表达式配置切入点")
    @Before(value = "execution(public int com.song.atguigu.annotation.Calculator.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("logger--> 前置通知, 方法名称: "+ methodName + ", 参数: "+ Arrays.toString(args) );
    }

    // 后置 @After()
    @After(value = "execution( * com.song.atguigu.annotation.Calculator.*(..))")
    public void afterMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("logger--> 后置通知, 方法名称: "+ methodName);
    }

    // 返回 @AfterReturning
    @AfterReturning(value = "execution( * com.song.atguigu.annotation.Calculator.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("logger--> 返回通知, 方法名称: "+ methodName + ", 目标方法返回结果: " + result);
    }


    // 异常 @AfterThrowing
    @AfterThrowing(value = "execution( * com.song.atguigu.annotation.Calculator.*(..))",throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Throwable ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("logger--> 返回通知, 方法名称: "+ methodName + "目标方法的异常信息: " +ex);
    }

    // 环绕 @Around()
    @Around(value = "execution( * com.song.atguigu.annotation.Calculator.*(..))")
    public void AroundMethod(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argString = Arrays.toString(args);
        System.out.println("logger--> 返回通知, 方法名称: "+ methodName );
    }



}
