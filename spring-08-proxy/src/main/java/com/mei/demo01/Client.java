package com.mei.demo01;

/**
 * @author mql
 * @date 2023年02月27日 21:39
 */
public class Client {
  public static void main(String[] args) {
    // 房东要 租房子
      Holder holder = new Holder();
      //代理 中介帮房东租房子  但是代理角色一般会有一些附属操作
      Proxy proxy = new Proxy(holder);
      // 不用面对房东，直接找中介租房
      proxy.rent();
  }
}
