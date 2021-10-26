package com.baidu.test;

import com.baidu.pojo.Student;
import com.baidu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = app.getBean("user", User.class);
        System.out.println(user);

        User user2 = app.getBean("user2", User.class);
        System.out.println(user2);
    }
}
