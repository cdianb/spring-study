## 常用依赖
```xml
    <dependencies>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-webmvc</artifactId>
                <version>5.2.0.RELEASE</version>
            </dependency>
    
            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>4.12</version>
                <scope>test</scope>
            </dependency>
                    
    
        </dependencies>
```    
## 注解说明
- @NUllAble 标明该字段可以为null
- @Autowired: 自动装配通过类型，名字
   如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value='xxx'')
- @Resource: 自动装配通过名字，类型

- @Component: 组件，放在类上，说明组件被spring管理了，就是bean！
