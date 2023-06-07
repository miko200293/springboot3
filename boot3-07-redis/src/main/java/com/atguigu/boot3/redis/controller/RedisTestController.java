package com.atguigu.boot3.redis.controller;

import com.atguigu.boot3.redis.controller.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class RedisTestController {



    @Autowired
    StringRedisTemplate redisTemplate1;


    //为了后来系统的兼容性，应该所有对象都是以json的方式进行保存
    @Autowired //如果给redis中保存数据会使用默认的序列化机制，导致redis中保存的对象不可视
            RedisTemplate<Object, Object>  redisTemplate;


    @GetMapping("/count")
    public String count(){
        Long hello = redisTemplate1.opsForValue().increment("hello");
        return "访问了【"+hello+"】次";
    }


    @GetMapping("/person/save")
    public String savePerson(){
        Person person = new Person("oliver",18,1L,new Date());

        //1、序列化： 对象转为字符串方式
        redisTemplate.opsForValue().set("person",person);

        return "ok";
    }

    @GetMapping("/person/get")
    public Person getPerson(){
        Person person = (Person) redisTemplate.opsForValue().get("person");

        return person;
    }

}
