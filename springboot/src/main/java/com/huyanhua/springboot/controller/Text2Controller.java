package com.huyanhua.springboot.controller;

import com.huyanhua.springboot.bean.Users;
import com.huyanhua.springboot.mapper.UsersMapper;
import com.huyanhua.springboot.service.impl.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class Text2Controller {

    @Autowired
    TextService textServiceimpl;

    @RequestMapping("springboot")
    @ResponseBody
    public String springbootdemo(Model model){
        Users getuserbyid = textServiceimpl.getuser();
        return getuserbyid.toString();
    }
}
