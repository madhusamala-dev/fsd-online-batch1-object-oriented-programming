package com.java.oop.strings;

import com.java.oop.Customer;

public class Main {

    static String name; // instance variable (heap)
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);
        String name = null; //local variable (stack)
        System.out.println(name);
        char[] chars = {'a','b','c','d'};
        String str2 = new String(chars);
        System.out.println(str2);
        String str3 = new String("abcd");

        String str4 = new String("abcd");
        System.out.println(str3 == str4);

        //String literals
        //
        String str5 = "abcd";
        String str6 = "abcd";
        System.out.println(str5 == str6);

        //String maniplation
        System.out.println(str5.charAt(3));

        String username = "admin$123";
        String password = "admin@123!";
        System.out.println(username.compareToIgnoreCase("AdMiN123"));
        String greeting = "Hello ";
        greeting = greeting.concat(username); // Hello admin123
        /*
        String objects are immutable objects
         */
        System.out.println(greeting);
        if(username.equalsIgnoreCase("AdMin123") && password.equals("admin@123!")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");


        }

        if(username.length() > 5 && username.length() < 10)
            System.out.println("Username length is valid");
        else
            System.out.println("Username length is invalid");

        //Regualr expression
        //username validataion alphanumeric with _
        String regex = "^[a-zA-Z0-9_]+$";
        if(username.matches(regex)) {
            System.out.println("Username is valid");
        } else
            System.out.println("Username is invalid");
        String customerData = "101,john,john@example.com,1234567890,25";
        String[] split = customerData.split(",");

        Customer customer = new Customer(Integer.parseInt(split[0]), split[1], split[2], split[3], Byte.parseByte(split[4]));
        System.out.println("Id : " + customer.id );
        System.out.println("Name :" + customer.name);
        System.out.println("Email : " + customer.email);
        System.out.println("Phone No : " + customer.phoneNo);
        System.out.println("Age : " + customer.age);

        String email = "     madhu@gmail.com        ";
        if(email.trim().equals("madhu@gmail.com"))
            System.out.println("Email is valid");
        else
            System.out.println("Email is invalid");
    }
}
