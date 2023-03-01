package com.mei.demo03;

import java.lang.reflect.InvocationHandler;

/**
 * @author mql
 * @date 2023年02月28日 18:46
 */
public class Client {
  public static void main(String[] args) {
    //真实角色
      Holder holder = new Holder();
      //代理角色： 现在没有
      ProxyInvocationHandler pih = new ProxyInvocationHandler();
      //通过调用程序处理角色来处理我们调用的接口对象
      pih.setRent(holder);
      Rent proxy = (Rent) pih.getProxy();  //这里的proxy就是动态生成的
      proxy.rent();
  }
}
