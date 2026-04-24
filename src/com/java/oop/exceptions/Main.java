package com.java.oop.exceptions;

import com.java.oop.streams.Product;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        ProductService productService = null;
        try {
            productService = new ProductService();
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        Product product = productService.getAllProducts().get(0);
        try {
            productService.addProduct(product);
        } catch (ProductExistsException e) {
            throw new RuntimeException(e);
        }

    }
}
