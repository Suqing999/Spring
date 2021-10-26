package com.baidu.test;

import com.baidu.pojo.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = app.getBean("student", Student.class);
        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getBooks());
        System.out.println(student.getHobbys());
        System.out.println(student.getCard());
        System.out.println(student.getGames());
        System.out.println(student.getWife());
        System.out.println(student.getInfo());
    }
}
