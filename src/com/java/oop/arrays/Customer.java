package com.java.oop.arrays;

public class Customer {
    int id;
    String name;
    String email;
    String phoneNo;
    byte age;
    char gender;


    Customer(int id, String name, String email, String phoneNo, byte age, char gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.age = age;
        this.gender = gender;
    }

    void displayCustomerDetails() {
        System.out.println("----------------Customer Details----------------");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone No: " + phoneNo);
        System.out.println("Age: " + age);
    }
}
