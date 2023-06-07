package com.miko.boot3.features.config;

import com.miko.boot3.features.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MyConfig {
    @Profile("dev")
    @Bean
    public Cat cat(){
        return new Cat();
    }
}
