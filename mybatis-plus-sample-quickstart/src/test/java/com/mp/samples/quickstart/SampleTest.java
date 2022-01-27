package com.mp.samples.quickstart;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.mp.sample.quickstart.Application;
import com.mp.sample.quickstart.entity.User;
import com.mp.sample.quickstart.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther d
 * @Date 2022/1/27 16:10
 * @Describe
 **/
@SpringBootTest(classes =Application.class )
public class SampleTest  {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(9, userList.size());
        System.out.println(userList.size());
        userList.forEach(System.out::println);
    }
}
