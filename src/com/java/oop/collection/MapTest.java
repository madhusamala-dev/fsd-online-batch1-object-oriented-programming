package com.java.oop.collection;

import com.java.oop.Product;
import com.java.oop.comparator.CustomerIdAscComparator;
import com.java.oop.model.Customer;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Customer> customersMap = new TreeMap<>();
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
                .setName("madhu1")
                .setEmail("madhu1@gmail.com")
                .setPhoneNo("+91-87427661232")
                .setAddress("Hyderabad");

        customersMap.put(customer1.getId(), customer1);
        customersMap.put(customer2.getId(), customer2);
        customersMap.put(customer3.getId(), customer3);
        customersMap.put(customer4.getId(), customer4);
        customersMap.put(customer5.getId(), customer5);
        System.out.println(customersMap);

        System.out.println(customersMap.get(1111));
        System.out.println("---customer map elements");
        for(Integer id : customersMap.keySet()) {
            System.out.println(customersMap.get(id));
        }

        Set<Map.Entry<Integer, Customer>> entries = customersMap.entrySet();
           Iterator<Map.Entry<Integer,Customer>> iterator = entries.iterator();
           while(iterator.hasNext()) {
               Map.Entry<Integer,Customer> entry = iterator.next();
               System.out.println(entry.getKey() + " : " + entry.getValue());
           }

           Map<Customer, List<Product>> customerProductMap = new TreeMap<>(new CustomerIdAscComparator());
    }

    /*public Map<String, List<Product>> getProductsByCategory(){
        //1000 products (id, name, price, category)
    }*/


}
