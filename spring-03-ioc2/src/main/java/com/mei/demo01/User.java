package com.mei.demo01;

/**
 * @author mql
 * @date 2023年02月22日 19:14
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name = " + name);
    }

    public User(String name){
        this.name = name;
        System.out.println("User的有参构造！！！！！！！！");
    }
}
