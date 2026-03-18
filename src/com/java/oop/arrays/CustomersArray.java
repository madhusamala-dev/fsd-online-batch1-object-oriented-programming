package com.java.oop.arrays;

public class CustomersArray {
    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1,"customer1","customer1@gmail.com","2342342323",(byte)20,'M');
        customers[1] = new Customer(3,"customer3","customer2@gmail.com","5675675675",(byte)40,'F');
        customers[2] = new Customer(5,"customer5","customer3@gmail.com","2352523423",(byte)30,'M');
        customers[3] = new Customer(2,"customer2","customer4@gmail.com","8797897897",(byte)60,'F');
        customers[4] = new Customer(4,"customer4","customer5@gmail.com","9345345433",(byte)70,'F');

        for(Customer customer : customers ){
            customer.displayCustomerDetails();
        }

        //sort all the customers by name
        //find the customer with highest age
        Customer highestAgeCustomer = customers[0];

        for(Customer customer : customers) {
            if(customer.age > highestAgeCustomer.age) {
                highestAgeCustomer = customer;
            }
        }
        highestAgeCustomer.displayCustomerDetails();
        System.out.println("Male Customer Count: " + getMaleCustomerCount(customers));
    }

    public static int getMaleCustomerCount(Customer[] customers){
        int maleCount = 0;
        for(Customer customer : customers) {
            if(customer.gender == 'M') {
                maleCount++;
            }
        }
        return maleCount;
    }
    public static int getFemaleCustomerCount(Customer[] customers){
        return 0;
    }
    public static Customer getCustomerById(Customer[] customers, int id){
        return null;
    }
    public static Customer highestAgedCustomer(Customer[] customers){
        return null;
    }
    public static Customer[] sortCustomersByName(Customer[] customers){
    return null;
    }
    public static int customersWithAgeGreaterThan(Customer[] customers, int age){
        return 0;
    }
    public static int customersWithAgeBetween(Customer[] customers, int minAge, int maxAge){
        return 0;
    }
}
