package com.baidu.service.impl;

import com.baidu.dao.UserDao;
import com.baidu.dao.impl.UserDaoImpl;
import com.baidu.service.UserService;

public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();

    //使用IOC思想 即 set动态设置
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
