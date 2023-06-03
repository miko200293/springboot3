package com.miko.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class HelloController {
    @GetMapping("/h")
    public String hello() {
        log.trace("trace diary....");
        log.debug("debug dairy....");
        //默认到info
        log.info("info dairy....");
        log.warn("warn dairy....");
        log.error("error dairy....");
        //log.info("come in");
        return "hello";

    }
}
