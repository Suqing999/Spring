package com.baidu.demo;

public class Client {
    public static void main(String[] args) {
        ZhongJie zhongJie = new ZhongJie(new Host());
        zhongJie.watchHouse();
        zhongJie.rent();
        zhongJie.getMoney();
    }
}
