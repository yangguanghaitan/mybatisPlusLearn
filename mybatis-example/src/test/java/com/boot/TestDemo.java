package com.boot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Auther d
 * @Date 2022/4/2 6:39
 * @Describe
 **/
@Slf4j
@SpringBootTest
public class TestDemo {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Test
    public void test002(){
        Integer count = jdbcTemplate.queryForObject("select count(*) from sys_province", Integer.class);
        log.info("count={}",count);
    }
}
