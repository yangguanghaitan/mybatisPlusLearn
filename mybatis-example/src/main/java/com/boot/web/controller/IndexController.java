package com.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther d
 * @Date 2022/4/2 18:14
 * @Describe welcome首页
 **/
@Controller
@RequestMapping
public class IndexController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
