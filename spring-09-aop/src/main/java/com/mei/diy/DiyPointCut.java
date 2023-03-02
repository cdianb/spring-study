package com.mei.diy;

/**
 * @author mql
 * @date 2023年03月02日 16:45
 */
public class DiyPointCut {
    public void before(){
        System.out.println("========方法执行前=========");
    }

    public void afterReturning(){
        System.out.println("========方法执行后=========");
    }
}
