package com.mei.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author mql
 * @date 2023年03月01日 21:50
 */
public class Log implements MethodBeforeAdvice {
    /**
     *
     * @author mql
     * @date 2023/3/1 21:52
     * @param method: 要执行的目标对象的方法
     * @param args：参数
     * @param target：目标对象
     */
    public void before(Method method, Object[] args, Object target) throws Throwable {
          System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
