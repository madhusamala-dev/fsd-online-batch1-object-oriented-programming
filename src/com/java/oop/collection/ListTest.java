package com.java.oop.collection;

import com.java.oop.model.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Customer> customers = new LinkedList<>();

        Customer customer1 = new Customer();
        customer1.setId(1111)
                .setName("madhu")
                .setEmail("madhu@gmail.com")
                .setPhoneNo("+91-97427661232")
                .setAddress("Hyderabad");
        Customer customer2 = new Customer();
        customer2.setId(4444)
                .setName("harika")
                .setEmail("harika@gmail.com")
                .setPhoneNo("+91-97427661223")
                .setAddress("Vishakhapatnam");
        Customer customer3 = new Customer();
        customer3.setId(3333)
                .setName("sushmita")
                .setEmail("sushmita@gmail.com")
                .setPhoneNo("+91-87427661232")
                .setAddress("Secunderabad");

        Customer customer4 = new Customer();
        customer4.setId(2222)
                .setName("jhahnavi")
                .setEmail("jhahnavi@gmail.com")
                .setPhoneNo("+91-97427661223")
                .setAddress("Vishakhapatnam");

        Customer customer5 = new Customer();
        customer5.setId(1111)
                .setName("madhu")
                .setEmail("madhu@gmail.com")
                .setPhoneNo("+91-97427661232")
                .setAddress("Hyderabad");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        System.out.println(customers);
        System.out.println(customers.size());
        System.out.println(customers.get(0));

        for(Customer customer : customers) {
            System.out.println(customer.getEmail());
        }
        //return customer emails list


    }
}
