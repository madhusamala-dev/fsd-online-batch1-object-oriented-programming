package com.java.oop.anonymous;

public class GreetingImpl implements Greeting{


    @Override
    public void greet() {
        System.out.println("Hello, How are you !");
    }

    @Override
    public void greet(String msg) {
        System.out.println(msg);
    }
}
