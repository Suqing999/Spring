package com.baidu.myaspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* com.baidu.service.impl.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("注解前置");
    }
}
