package com.mei.demo04;

import com.mei.demo02.UserService;
import com.mei.demo02.UserServiceImpl;

/**
 * @author mql
 * @date 2023年02月28日 19:19
 */
public class Client {
  public static void main(String[] args) {
    // 真实角色
      UserServiceImpl userService = new UserServiceImpl();
      //代理角色： 现在没有
      ProxyInvocationHandler pih = new ProxyInvocationHandler();
      //设置要代理的对象
      pih.setTarget(userService);
      //动态生成代理类
      UserService proxy = (UserService) pih.getProxy();
      proxy.delete();
  }
}
