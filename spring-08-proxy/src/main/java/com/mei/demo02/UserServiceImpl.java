package com.mei.demo02;

/**
 * @author mql
 * @date 2023年02月27日 22:00
 */
public class UserServiceImpl implements UserService{
    public void add() {
    System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void query() {
        System.out.println("查找了一个用户");
    }
}
