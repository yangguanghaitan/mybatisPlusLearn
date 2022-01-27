package com.mp.sample.quickstart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther d
 * @Date 2022/1/27 15:52
 * @Describe
 **/
@SpringBootApplication
@MapperScan("com.mp.sample.quickstart.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

