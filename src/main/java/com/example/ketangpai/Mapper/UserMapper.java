package com.example.ketangpai.Mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User query(User user);

    public int add(User user);
}


