package com.mei.demo01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author mql
 * @date 2023年02月26日 17:58
 */
// 等价于 <bean id="user" class="com.mei.pojo.User"/>
@Component
@Scope(value="prototype")
public class User {
    @Value("小徐")
    public String name;
}
