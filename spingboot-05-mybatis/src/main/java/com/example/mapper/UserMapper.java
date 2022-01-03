package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示这是一个mybatis 的mapper类 Dao
@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();
    User queryUserList(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}
