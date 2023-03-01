package com.mei.demo01;

/**
 * @author mql
 * @date 2023年02月22日 19:44
 */
public class UserT {
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

    public UserT(){
        System.out.println("UserT被创建了！！！！");
    }
}
