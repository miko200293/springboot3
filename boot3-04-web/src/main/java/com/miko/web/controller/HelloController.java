package com.miko.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.miko.web.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //默认支持把对象写成json
    //想要支持xml需要maven导包
    @GetMapping("/person")
    public Person person(){
        Person person =new Person();
        person.setId(8964);
        person.setAge(18);
        person.setEmail("aaa@qq.com");
        person.setUsername("miko");
        return person;
    }

    public static void main(String[] args) throws JsonProcessingException {
        Person person =new Person();
        person.setId(8964);
        person.setAge(18);
        person.setEmail("aaa@qq.com");
        person.setUsername("miko");

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }
}
