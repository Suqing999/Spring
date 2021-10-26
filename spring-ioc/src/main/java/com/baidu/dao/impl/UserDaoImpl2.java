package com.baidu.dao.impl;

import com.baidu.dao.UserDao;

public class UserDaoImpl2 implements UserDao {

    @Override
    public void getUser() {
        System.out.println("第二种实现");
    }
}
