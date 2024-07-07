package com.song.atguigu.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * Java 后置处理器
 */
@Configuration
public class MybeanPost implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(" 1 -----bean 后置处理器，在初始化之前执行");
        System.out.println(beanName + "::" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println(" 2 -----bean 后置处理器，在初始化之后执行");
        System.out.println(beanName + "::" + bean);

        return bean;
    }
}
