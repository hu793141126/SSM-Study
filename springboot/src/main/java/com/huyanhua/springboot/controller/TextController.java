package com.huyanhua.springboot.controller;

import com.huyanhua.springboot.porperty.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author: @我没有三颗心脏
 * @create: 2018-05-08-下午 16:46
 */
@RestController
public class TextController {
//    @Value("${name}")
//    private  String name;
//    @Value("${text}")
//    private  String text;
    @Autowired
    private StudentProperties studentProperties;
    @RequestMapping("/hello")
    public String hello() {
        return studentProperties.toString();
    }
}