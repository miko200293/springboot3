package com.miko.boot3.features.bean;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
//
//@Profile("dev")
//@Component
public class Cat {
    private String name;
    private Integer age;
}