package com.mei.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author mql
 * @date 2023年03月02日 17:22
 * 使用注解方式实现aop
 */
@Aspect //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.mei.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("========方法执行前o=========");
    }

    @After("execution(* com.mei.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=======方法执行后o=========");
    }

  //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
  @Around("execution(* com.mei.service.UserServiceImpl.*(..))")
  public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        Signature signature = joinPoint.getSignature();//获得签名
        System.out.println("signature:" + signature);
        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");
  }
    
}
