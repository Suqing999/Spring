package com.baidu.demo;

//房东
public class Host  implements Rent{
    //真实角色
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }

}
