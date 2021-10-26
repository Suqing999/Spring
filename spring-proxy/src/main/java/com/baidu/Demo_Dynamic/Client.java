package com.baidu.Demo_Dynamic;


public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色
        //现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
       //通过调用处理程序，处理调用的接口对象即可
        pih.setRent(host);

        Rent proxy = (Rent)pih.getProxy(); //这个proxy就是动态生成的代理类，并没有写

        proxy.rent();

    }
}
