package com.song.atguigu.factorybean;

import com.song.atguigu.entity.User;
import org.springframework.beans.factory.FactoryBean;

public class Myfactorybean implements FactoryBean <User>{
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
