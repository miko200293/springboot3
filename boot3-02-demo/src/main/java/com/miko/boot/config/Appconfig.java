package com.miko.boot.config;

import com.miko.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Appconfig {
    @Scope
    @Bean
    public User user(){
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        return user;
    }

}
