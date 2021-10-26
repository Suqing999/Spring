package com.baidu.pojo;

public class Hello {
    private String name;

    public void show(){
        System.out.println("say hello ");
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
