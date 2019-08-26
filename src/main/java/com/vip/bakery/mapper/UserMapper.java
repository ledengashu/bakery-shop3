package com.vip.bakery.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    boolean login(@Param("username") String username,@Param("password") String password);
}
