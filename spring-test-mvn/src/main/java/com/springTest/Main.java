package com.springTest;

import com.springTest.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

/**
 * Created by Dell on 2019/4/22.
 */

public class Main {

    static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("info test .....");


        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfigure.class);
        UserService userService = ctxt.getBean(UserService.class);
        userService.setAge("10");
        userService.setName("nickA");
    }

}
