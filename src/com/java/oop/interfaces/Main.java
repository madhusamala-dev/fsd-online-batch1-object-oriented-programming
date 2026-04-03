package com.java.oop.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your option: ");
        System.out.println("1. Cash On Delivery");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. UPI ");
        System.out.println("Enter Your Choice: ");
        int choice = scanner.nextInt();
        OrderService orderService;
        Payment payment;
        double amount;
        int otp;
        switch (choice) {
            case 1:
                payment = new CashOnDeliveryPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                if (orderService.processOrder(amount))
                    System.out.println("Order processed successfully using cash");
                break;
            case 2:
                payment = new CreditCardPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();

                if (orderService.processOrder(amount))
                    System.out.println("Order processed successfully using credit card");

                break;
            case 3:
                payment = new DebitCardPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();

                if (orderService.processOrder(amount))
                    System.out.println("Order processed successfully using debit card");
                break;
            case 4:
                payment = new UpiPayment();
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                if (orderService.processOrder(amount))
                    System.out.println("Order processed successfully using UPI");
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}
