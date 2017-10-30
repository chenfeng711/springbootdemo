package com.xohaa.cjx.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenjianxiong on 2017/10/26.
 * 官方示例工程中的测试代码
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    //是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World!";
    }

    /*
    public static void main(String[] args) throws Exception{
        SpringApplication.run(SampleController.class,args);
    }
    */
}
