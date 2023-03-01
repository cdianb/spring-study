package com.mei.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author mql
 * @date 2023年03月01日 21:58
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     *
     * @author mql
     * @date 2023/3/1 21:59
     * @param returnValue:返回值
     * @param method
     * @param args
     * @param target
     */
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
    System.out.println("执行了" + method.getName() + "方法,返回的结果为" + returnValue);
    }
}
