package com.java.oop;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Product object
        Product product; //no object exists product is just a reference variable
        product = new Product(1,"Samsung Galaxy S20",120000,10.5F,4.5F,true); //new Constructor()

        //initialize
        /*product.id = 1;
        product.name = "Samsung Galaxy S20";
        product.maxRetailPrice = 120000;
        product.discountPercentage = 10.5F;
        product.rating = 4.5F;
        product.isAvailable = true;*/

        /*System.out.println("Id: " + product.id);
        System.out.println("Name: " + product.name);
        System.out.println("MRP: " + product.maxRetailPrice);
        System.out.println("Discount: " + product.discountPercentage);
        System.out.println("Rating: " + product.rating);
        System.out.println("Available: " + product.isAvailable);
*/

        product.displayProductDetails();
        Product product2 = new Product(2,"Samsung Galaxy S21",130000,15.5F,4.5F,false);
        /*product2.id = 2;
        product2.name = "Samsung Galaxy S21";
        product2.maxRetailPrice = 130000;
        product2.discountPercentage = 15.5F;
        product2.rating = 4.5F;
        product2.isAvailable = false;*/

     /*   System.out.println("Id: " + product2.id);
        System.out.println("Name: " + product2.name);
        System.out.println("MRP: " + product2.maxRetailPrice);
        System.out.println("Discount: " + product2.discountPercentage);
        System.out.println("Rating: " + product2.rating);
        System.out.println("Available: " + product2.isAvailable);
*/
        product2.displayProductDetails();

        product.displayProductsByCompany("Apple");
        product.displayProductsByManufacturingYear(2020);
        product.displayProductsByCompanyAndManufacturingYear("Apple",2020);
        int totalProductCount = product.getTotalProductCount();
        System.out.println("Total product count: " + totalProductCount);
        long totalProductsValue = product.getTotalProductsValue();
        System.out.println("Total products value: " + totalProductsValue);
        List<Product> productList = product.filterProductsBasedOnPriceRange(10000, 100000);

        //static members
        System.out.println("Company Name : " + Product.COMPANY_NAME);
        System.out.println("Company Name via instance : " + product.COMPANY_NAME);
        /*
        product.companyName = "Samsung";
        System.out.println("Company Name via instance : " + product.companyName);
        System.out.println("Company Name via static : " + Product.companyName);
        */
        System.out.println("Company Email: " + Product.COMPANY_EMAIL);
        System.out.println("Company Phone No: " + Product.COMPANY_PHONE_NO);
        Product.displayCompanyDetails();
    }

}