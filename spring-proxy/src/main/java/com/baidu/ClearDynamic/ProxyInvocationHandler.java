package com.baidu.ClearDynamic;

import com.baidu.Demo_Dynamic.Rent;
import sun.applet.resources.MsgAppletViewer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理调用程序，用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口(代理谁！)
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //得到生成代理类（生成代理类！）
    public Object getProxy(){
        Object o = Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
        return o;
    }


    //处理代理实例，并返回结果(调用代理程序方法)
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //msg 执行前缀
        beforefunc(method.getName());
        //动态代理的本质就是用反射机制
        Object result = method.invoke(target, args); //执行参数的方法

        afterfunc(method.getName());
        return result;
    }


    public void beforefunc(String msg){
        System.out.println(msg +"前缀");
    }

    public void afterfunc(String msg){
        System.out.println(msg +"后缀");
    }
}
