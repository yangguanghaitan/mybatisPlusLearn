package com.boot.web.controller;

import com.boot.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther d
 * @Date 2022/4/2 9:41
 * @Describe
 **/
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {
    @Value("${filepath.profile}")
    String filePath;

    @GetMapping("/profile")
    public void testProfile(HttpServletRequest request) {
        String ContentType = request.getHeader("Content-Type");
        logger.info("filePath,{}",filePath);
        logger.info("ContentType,{}",ContentType);
    }
}
