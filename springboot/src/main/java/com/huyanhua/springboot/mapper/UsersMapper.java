package com.huyanhua.springboot.mapper;

import com.huyanhua.springboot.bean.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

public interface UsersMapper {
    public Users getuserbyid();
}
