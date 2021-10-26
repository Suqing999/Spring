package com.baidu.test;

import com.baidu.dao.impl.UserDaoImpl;
import com.baidu.dao.impl.UserDaoImpl2;
import com.baidu.service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        /**
         * 静态 普通 传值
         *     UserServiceImpl userService = new UserServiceImpl();
         *     userService.getUser();
         * */


        //基于ioc思想
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl2());
        userService.getUser();
    }
}
