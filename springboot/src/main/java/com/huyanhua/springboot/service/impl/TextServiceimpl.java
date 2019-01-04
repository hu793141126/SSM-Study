package com.huyanhua.springboot.service.impl;

import com.huyanhua.springboot.bean.Users;
import com.huyanhua.springboot.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TextServiceimpl implements TextService{
    @Resource
    UsersMapper usersMapper;

    @Override
    public Users getuser() {
       Users users=usersMapper.getuserbyid();
       return  users;
    }
}
