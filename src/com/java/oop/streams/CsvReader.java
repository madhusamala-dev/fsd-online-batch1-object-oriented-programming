package com.java.oop.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public List<Product> getProductsFromCsv() throws IOException {
        //CSV file path
        File file = new File("D://products.csv");
        BufferedReader br = new BufferedReader(new FileReader(file));
        //System.out.println(br.readLine());
        br.readLine();
        String productData = br.readLine();
        List<Product> products = new ArrayList<>();
        while(productData  != null){
            //System.out.println(productData);
            String[] data = productData.split(",");
            Product product = new Product();
            product.setId(Integer.parseInt(data[0]));
            product.setName(data[1]);
            product.setMaxRetailPrice(Integer.parseInt(data[2]));
            product.setDiscountPercentage(Byte.parseByte(data[3]));
            product.setAvailable(Boolean.parseBoolean(data[4]));
            product.setCompany(data[5]);
            product.setCategory(data[6]);

            products.add(product);
            productData = br.readLine();
        }
        return products;
    }
}
