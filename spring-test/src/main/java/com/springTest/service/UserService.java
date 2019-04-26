package com.springTest.service;

import org.springframework.stereotype.Component;

/**
 * Created by Dell on 2019/4/25.
 */

@Component
public class UserService {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
