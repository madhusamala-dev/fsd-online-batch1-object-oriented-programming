package com.java.oop.functional;

public class Main {
    public static void main(String[] args) {
        /*Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, How are you !");
            }
        };*/

        Greeting greeting = (name, msg) -> System.out.println(name + " , "+msg);
        greeting.greet("madhu","Hello, How are you today?");
    }
}
