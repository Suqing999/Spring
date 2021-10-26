package com.baidu.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class People {

    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
