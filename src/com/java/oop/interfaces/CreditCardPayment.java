package com.java.oop.interfaces;

public class CreditCardPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment done successfully:  " + amount);
        return true;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }

}
