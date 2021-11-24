package com.egsee.demo.mapper;

import com.egsee.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getByName(User user);
}
