package com.song.atguigu.bean.impl;

import com.song.atguigu.bean.ApplicationContext;

import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class AnnotationApplicationContext implements ApplicationContext {

    //创建 Map 集合 放 bean 对象
    private Map<Class,Object> beanFactory = new HashMap<>();

    @Override
    public Object getBean(Class clzz) {
        return beanFactory.get(clzz);
    }

    public AnnotationApplicationContext (String basePackage){

        String spackagePath = basePackage.replaceAll("\\.", "\\\\");

        try {
            Enumeration<URL> urls
                    = Thread.currentThread().getContextClassLoader().getResources(spackagePath);
            while(urls.hasMoreElements()){
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

//    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationApplicationContext("aom.atguigu");
//        context.getBean(User);
//    }


}
