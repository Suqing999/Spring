package com.baidu.demo;

public class ZhongJie implements Rent{

    private Host host;

    public ZhongJie() {
    }

    public ZhongJie(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();  //代理帮忙租房子
    }

    public void watchHouse(){
        System.out.println("中介带看房");
    }

    public void getMoney(){
        System.out.println("中介收费");
    }
}
