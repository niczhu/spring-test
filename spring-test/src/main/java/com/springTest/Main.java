package com.springTest;

import com.springTest.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

/**
 * Created by Dell on 2019/4/22.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("main start...");
        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfigure.class);
        UserService userService = ctxt.getBean(UserService.class);
        userService.setAge("10");
        userService.setName("nickA");
        System.out.println( userService.getName());
    }

}
