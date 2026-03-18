package com.java.oop;

import java.util.List;

public class Product {

    //state
    //id,name, maxRetailPrice, discountPercentage, rating, isAvailable
    //instance (object) variables
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;


   final static String COMPANY_NAME = "amazon"; //amazon // class specific
   final static String COMPANY_EMAIL = "support@amazon.com";
   final static String COMPANY_PHONE_NO = "1234567890";
    //constructor
    Product() {
        System.out.println("Product() is called.");
        id = 1;
        name = "Samsung Galaxy S20";
        maxRetailPrice = 120000;
        discountPercentage = 10.5F;
        rating = 4.5F;
        isAvailable = true;
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }

    //behaviour
    //method declaration
    void displayProductDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("MRP: " + maxRetailPrice);
        System.out.println("Discount: " + discountPercentage);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
    }

    //with arugments without returntype

    void displayProductsByCompany(String companyName) {
        System.out.println("Products by company: " + companyName);
    }

    // display products by manufacturering year
    void displayProductsByManufacturingYear(int year) {
        System.out.println("Products by manufacturing year: " + year);
    }

    void displayProductsByCompanyAndManufacturingYear(String companyName, int year) {
        System.out.println("Products by company and manufacturing year: " + companyName + " " + year);
    }
    //without arguments with returntype
    // total count of products
    int getTotalProductCount() {
        return 10;
    }

    long getTotalProductsValue() {
        return 1000000000000L;
    }

    //highest rated product
    Product getHighestRatedProduct() {
        return new Product();
    }

    //sort the products based on rating which should
    //return a list of products
    List<Product> sortProductsBasedOnRating() {
        return null;
    }

    //filter the products based on min and max price range
    List<Product> filterProductsBasedOnPriceRange(int minPrice, int maxPrice) {
        return null;
    }

    static void displayCompanyDetails() {
        System.out.println("Company Name : " + COMPANY_NAME);
        System.out.println("Company Email : " + COMPANY_EMAIL);
        System.out.println("Company Phone No : " + COMPANY_PHONE_NO);
    }
}
