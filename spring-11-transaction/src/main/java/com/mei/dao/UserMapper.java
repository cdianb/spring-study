package com.mei.dao;

import com.mei.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author mql
 * @date 2023年03月03日 15:51
 */
public interface UserMapper {
    List<User> getUsers();

    //添加一个用户
    public int addUser(@Param("user") User user);

    //删除一个用户
    public int deleteUser(@Param("id") int id);
}
