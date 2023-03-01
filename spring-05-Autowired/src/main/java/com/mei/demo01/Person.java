package com.mei.demo01;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author mql
 * @date 2023年02月26日 10:04
 */
public class Person {
//    @Resource(name = "cat11")
//    private Cat cat;
//    @Resource
//    private Dog dog;
@Autowired(required = false)
//@Qualifier(value = "cat22")
private Cat cat;
    @Autowired
//    @Qualifier(value = "dog1")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
