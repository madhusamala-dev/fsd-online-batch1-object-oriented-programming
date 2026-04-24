package com.java.oop.exceptions;


import com.java.oop.streams.CsvReader;
import com.java.oop.streams.Product;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class ProductService {

    List<Product> products;
    ProductService() throws IOException {
        products = new CsvReader().getProductsFromCsv();
    }

    public Optional<Product> getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }
    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) throws ProductExistsException {
       Optional<Product> productById =  getProductById(product.getId());
       if(productById.isPresent()) {
           throw new ProductExistsException("Product already exists with id : " + product.getId());
       } else {
           products.add(product);
       }
        return product;
    }
}
