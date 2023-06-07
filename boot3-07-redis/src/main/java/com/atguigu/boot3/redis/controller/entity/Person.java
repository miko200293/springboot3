package com.atguigu.boot3.redis.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {
    private String name;
    private Integer age;
    private Long id;
    private Date birthhDay;

}
