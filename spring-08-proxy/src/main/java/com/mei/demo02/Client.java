package com.mei.demo02;

/**
 * @author mql
 * @date 2023年02月27日 22:02
 */
public class Client {
  public static void main(String[] args) {
    UserServiceImpl userService = new UserServiceImpl();
    UserServiceProxy serviceProxy = new UserServiceProxy();
    serviceProxy.setUserService(userService);
    serviceProxy.delete();
  }
}
