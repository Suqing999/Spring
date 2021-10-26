package com.baidu.test;

import com.baidu.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("annotationContext.xml");
        UserService userService = app.getBean("userService", UserService.class);
        userService.add();
    }
}
