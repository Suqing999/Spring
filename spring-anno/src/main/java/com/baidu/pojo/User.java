package com.baidu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    public String name = "张三";

    @Value("昆明")
    public String address;
}
