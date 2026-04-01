package com.java.oop.abstraction;

public class OrderService {

    Payment payment;

    public OrderService(Payment payment){
        this.payment = payment;
    }

    /*public boolean processOrder(double amount){
        Payment payment = new Payment();
        payment.pay(amount);
        return true;
    }
    public boolean processOrderCreditCard(double amount){
        CreditCardPayment payment = new CreditCardPayment();
        return payment.pay(amount);
    }*/

    public boolean processOrder(double amount){

        return payment.pay(amount);
    }
}
