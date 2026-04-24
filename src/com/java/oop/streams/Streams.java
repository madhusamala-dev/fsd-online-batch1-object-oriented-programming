package com.java.oop.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args)  {
        CsvReader csvReader = new CsvReader();
        List<Product> products = null;
        try {
            products = csvReader.getProductsFromCsv();
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        System.out.println(products.size());

        //intermediate opertation
        /*
        filter
        list of products within a range 10000, 10000
         */

        List<Product> filteredProducts = new ArrayList<>();
        ;
        for (Product product : products) {
            if (product.getMaxRetailPrice() >= 10000 && product.getMaxRetailPrice() <= 100000) {
                filteredProducts.add(product);
            }
        }
        System.out.println(filteredProducts);
        System.out.println("-----------------------------");
        System.out.println("Using Streams: ");
        List<Product> filteredProducts1 = products.stream()
                .filter(product -> product.getMaxRetailPrice() >= 10000 && product.getMaxRetailPrice() <= 100000)
                .toList();
        System.out.println(filteredProducts1);

        List<String> productsNames;
        productsNames = products.stream().map(Product::getName).toList();
        System.out.println(productsNames);

        //non-duplicates
        List<Product> nonDuplicateProducts = products.stream().distinct().toList();
        System.out.println(nonDuplicateProducts.size());

        //sorted based on price

        List<Product> sortedProductsBasedOnPrice = products.stream().sorted((p1, p2) -> Double.compare(p1.getMaxRetailPrice(), p2.getMaxRetailPrice())).toList();
        System.out.println(sortedProductsBasedOnPrice);

        //sorted based on name
        List<Product> sortedProductsBasedOnName = products.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).toList();
        System.out.println(sortedProductsBasedOnName);

        //top 5 highest priced products
        List<Product> top5HighestPricedProducts = products.stream().sorted((p1, p2) -> Double.compare(p2.getMaxRetailPrice(), p1.getMaxRetailPrice())).limit(5).toList();
        System.out.println(top5HighestPricedProducts);

        products.forEach(System.out::println);

        //grouping based on companies
        Map<String, List<Product>> productsByCompany = products.stream().collect(Collectors.groupingBy(Product::getCompany));
        System.out.println("-------------Products By Company -------------");
        System.out.println(productsByCompany);
        System.out.println("-------------Products By Category -------------");
        Map<String, Long> productsCountByCategory = products.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        System.out.println(productsCountByCategory);

        products.stream()
                .collect(Collectors.groupingBy(Product::getCompany, Collectors.counting()))
                .forEach((company, count) -> System.out.println(company + " : " + count));

        //company total inventory
        long totalInventoryValue = products.stream().collect(Collectors.summingLong(Product::getMaxRetailPrice));
        System.out.println("Total Inventory Value: " + totalInventoryValue);

        long totalInventoryValue1 = products.stream().mapToLong(Product::getMaxRetailPrice).sum();
        System.out.println("Total Inventory Value: " + totalInventoryValue1);
        double averagePrice = products.stream().mapToDouble(Product::getMaxRetailPrice).average().orElse(0);
        System.out.println("Average Price: " + averagePrice);
    }

}
