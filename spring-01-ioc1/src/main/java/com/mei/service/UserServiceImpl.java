package com.mei.service;

import com.mei.dao.UserDao;
import com.mei.dao.UserDaoImpl;

/**
 * @author mql
 * @date 2023年02月14日 21:24
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
         userDao.getUser();
     }
}
