package com.xohaa.cjx.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chenjianxiong on 2017/10/27.
 * 项目启动入口，配置包根路径
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.xohaa.cjx")
public class Entry {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Entry.class,args);
    }
}
