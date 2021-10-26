package com.baidu.test;

import com.baidu.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = cpac.getBean("hello", Hello.class);
        System.out.println(hello);
        hello.show();
    }
}
