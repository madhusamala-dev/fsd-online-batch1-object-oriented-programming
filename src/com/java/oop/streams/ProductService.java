package com.java.oop.streams;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class ProductService {

    List<Product> products;

   public ProductService() throws IOException {
        this.products = new CsvReader().getProductsFromCsv();
    }

    List<Product> getProductsByAvailability(boolean isAvailable){
       //streams
        return null;
    }

    Optional<Product> getProductById(int id){
       Optional<Product> product = Optional.empty();

       for(Product p : products){
           if(p.getId() == id){
               product = Optional.of(p);
               break;
           }
       }
       return product;
    }
}
