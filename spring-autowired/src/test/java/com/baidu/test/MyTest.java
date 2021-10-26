package com.baidu.test;

import com.baidu.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people =(People) app.getBean("people");
        people.getCat().sounds();
        people.getDog().sounds();
    }
}
