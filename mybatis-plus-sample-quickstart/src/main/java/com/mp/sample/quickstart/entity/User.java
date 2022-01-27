package com.mp.sample.quickstart.entity;

import lombok.Data;

/**
 * @Auther d
 * @Date 2022/1/27 16:01
 * @Describe
 **/
@Data
 public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

