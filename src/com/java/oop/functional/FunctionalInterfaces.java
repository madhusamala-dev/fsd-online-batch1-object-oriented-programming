package com.java.oop.functional;


import com.java.oop.Product;
import com.java.oop.model.Customer;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        //Predicate
        Predicate<String> length = (str) -> str.length() >= 5 && str.length() <= 10;
        System.out.println(length.test("madhudsfasdfasd"));

        Customer customer = new Customer();
        customer.setId(1111);
        customer.setName("madhu");
        customer.setEmail("madhu@gmail.com");
        customer.setPhoneNo("+91-97427661232");
        customer.setAddress("Hyderabad");

        Consumer<Customer> printCustomer = (customer1) -> {
            System.out.println("Id : " + customer1.getId());
            System.out.println("Name :" + customer1.getName());
            System.out.println("Email : " + customer1.getEmail());
            System.out.println("Phone No : " + customer1.getPhoneNo());
            System.out.println("Address : " + customer1.getAddress());
        };
        printCustomer.accept(customer);

    }
}
