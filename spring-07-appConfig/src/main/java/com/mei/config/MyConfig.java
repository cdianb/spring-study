package com.mei.config;

import com.mei.demo01.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author mql
 * @date 2023年02月26日 18:36
 */

/**
 *这个也会被Spring容器托管，注册到容器中，因为它本身也是一个@Component
 * @Configuration 代表这是一个配置类，等价于beans.xml
 */
@Configuration
@ComponentScan("com.mei.demo01")
@Import(MyConfig2.class)
public class MyConfig {
    /**
     *注册一个bean，就相当于之前xml配置文件里面写的一个bean标签
     * 这个方法的名字，就相当于bean标签的id
     * 方法的返回值就相当于bean标签的class属性
     */
    @Bean
    public User getUser(){
       return new User();         //返回要注入到bean中的对象
    }
    
}
