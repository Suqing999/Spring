package com.baidu.test;

import com.baidu.config.MyConfig;
import com.baidu.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = ann.getBean("getUser", User.class);
        System.out.println(user);
    }
}
