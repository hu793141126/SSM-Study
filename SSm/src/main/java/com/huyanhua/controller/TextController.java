package com.huyanhua.controller;

import com.huyanhua.bean.Users;
import com.huyanhua.service.Textservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TextController {
    @Autowired
    Textservice textserviceimpl;
    @RequestMapping("demo")
    @ResponseBody
    public String getuser1(){
        Users getuserbyid = textserviceimpl.getuserbyid(1);
        String s=getuserbyid.toString();
        getuserbyid = textserviceimpl.getuserbyid(2);
        String s1=getuserbyid.toString();
        return s+s1;
    }
}
