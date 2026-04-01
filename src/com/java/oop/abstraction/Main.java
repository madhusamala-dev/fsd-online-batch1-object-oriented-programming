package com.java.oop.abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        OrderService orderService = new OrderService();
        if(orderService.processOrder(10000))
            System.out.println("Order processed successfully using cash");

        if(orderService.processOrderCreditCard(345345))
            System.out.println("Order processed successfully using credit card");
   */
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
                payment = new CashOnDeliveryPayment("1","Madhu Samala","01-04-2026","cash_on_delivery");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (orderService.processOrder(amount))
                    System.out.println("Order processed successfully using cash");
                break;
            case 2:
                payment = new CreditCardPayment("2","Madhu Samala","01-04-2026","credit_card");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (orderService.processOrder(amount))
                    System.out.println("Order processed successfully using credit card");

                break;
            case 3:
                payment = new DebitCardPayment("3","Madhu Samala","01-04-2026","debit_card");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (orderService.processOrder(amount))
                    System.out.println("Order processed successfully using debit card");
                break;
            case 4:
                payment = new UpiPayment("4","Madhu Samala","01-04-2026","upi");
                orderService = new OrderService(payment);
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                System.out.println("Enter OTP");
                otp = scanner.nextInt();
                payment.otpValidation(otp);
                if (orderService.processOrder(amount))
                    System.out.println("Order processed successfully using UPI");
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}
