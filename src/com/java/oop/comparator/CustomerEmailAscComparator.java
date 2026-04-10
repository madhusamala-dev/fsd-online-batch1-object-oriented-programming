package com.java.oop.comparator;

import com.java.oop.model.Customer;

import java.util.Comparator;

public class CustomerEmailAscComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getEmail().compareTo(c2.getEmail());
    }
}
