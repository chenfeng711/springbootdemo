package com.xohaa.cjx.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenjianxiong on 2017/10/26.
 * hello
 */
@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        System.out.println("---->");
        return "Hello World!xxqqqqx";
    }
}
