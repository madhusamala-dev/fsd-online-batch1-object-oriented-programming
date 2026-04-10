package com.java.oop.collection;

import com.java.oop.comparator.CustomerEmailAscComparator;
import com.java.oop.comparator.CustomerEmailDescComparator;
import com.java.oop.comparator.CustomerIdAscComparator;
import com.java.oop.comparator.CustomerIdDescComparator;
import com.java.oop.model.Customer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomerSet {
    public static void main(String[] args) {
        Set<Customer> customers = new TreeSet<>(new CustomerEmailDescComparator());

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

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        System.out.println(customers);
        System.out.println(customers.size());
    }
}
