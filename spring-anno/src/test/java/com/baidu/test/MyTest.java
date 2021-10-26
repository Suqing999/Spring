package com.baidu.test;

import com.baidu.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("annotationContext.xml");
        User user = app.getBean("user", User.class);
        System.out.println(user.name);
        System.out.println(user.address);
    }
}
