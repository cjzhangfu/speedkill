package com.ifeng.speedkill.dao;

import com.ifeng.speedkill.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from t_username where id =#{id}")
    public User getById(@Param("id") int id);
    @Select("insert into t_username(id,username) values(#{id},#{username})")
    public int insert(User user);
}
