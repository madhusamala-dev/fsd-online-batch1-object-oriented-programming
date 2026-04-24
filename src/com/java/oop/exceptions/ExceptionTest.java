package com.java.oop.exceptions;

import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter another number: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
            String name = getName();

            System.out.println("Hello " + name.toUpperCase() + "!");
        } /*catch (ArithmeticException e) {
            // System.out.println("Error: " + e.getMessage());
            System.out.println("Number2 cant be zero");
            input();
        } catch(NullPointerException e){
            System.out.println("Name cant be null");
            input();
        }*/
        catch(Exception e){
            System.out.println("Some internal error occurred.");
            System.out.println("Error: " + e.getMessage());
            input();
        }
    }

    private static void input() {
        System.out.println("input continues");
    }

    public static String getName() {
        String name = null;
        //code
        return name;
    }
}
