package com.huyanhua.service.impl;

import com.huyanhua.bean.Users;
import com.huyanhua.mapper.UsersMapper;
import com.huyanhua.service.Textservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class Textserviceimpl  implements Textservice {
    @Autowired
    UsersMapper usersMapper;
    public Users getuserbyid(int id) {
        Users users = usersMapper.seluserbyid(id);
        return  users;
    }
}
