package com.example;


import org.springframework.beans.factory.annotation.Autowired;

public class MySingletonBean {

    @Autowired
    private MyPrototypeBean prototypeBean;

    public void showMessage(){
        System.out.println("Hello, the time is "+ prototypeBean.getDateTime());
    }
}