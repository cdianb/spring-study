package com.mei.dao;

import com.mei.pojo.User;

import java.util.List;

/**
 * @author mql
 * @date 2023年03月03日 15:51
 */
public interface UserMapper {
    List<User> getUsers();
}
