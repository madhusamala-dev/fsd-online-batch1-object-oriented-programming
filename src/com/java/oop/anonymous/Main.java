package com.java.oop.anonymous;

public class Main {
    public static void main(String[] args) {
       /* GreetingImpl greeting = new GreetingImpl() ;
        greeting.greet();
        greeting.greet("Hello, How are you today?");*/

        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, How are you !");
            }

            @Override
            public void greet(String msg) {
                System.out.println(msg);
            }
        };
        greeting.greet();
        greeting.greet("Hello, How are you today?");

    }
}
