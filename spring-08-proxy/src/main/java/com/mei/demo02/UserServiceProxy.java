package com.mei.demo02;

/**
 * @author mql
 * @date 2023年02月27日 22:04
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public UserServiceProxy() {

    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("使用了add方法");
        userService.add();
    }

    public void delete() {
        log("使用了delete方法");
        userService.delete();
    }

    public void update() {
        log("使用了update方法");
        userService.update();
    }

    public void query() {
        log("使用了query方法");
       userService.query();
    }

    //日志方法
    public void log(String msg){
    System.out.println(msg);
    }


}
