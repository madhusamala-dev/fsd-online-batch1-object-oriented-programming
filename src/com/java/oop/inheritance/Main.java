package com.java.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        //System.out.println("Id : " + product.id);
        product.displayDetails();
        Product product2 = new Product(2, "Product 2", 100, 10, 4.5f, true);
        product2.displayDetails();

        Laptop laptop = new Laptop();
        System.out.println(laptop.operatingSystem);
        System.out.println(laptop.hardDiskSize);
        System.out.println(laptop.ram);

        Laptop laptop2 = new Laptop(1,"MacBook Pro",200000,15.5F,4.5F,true,128,8, "MacOS");
        laptop2.displayDetails();

        Book book = new Book(2,"Book 2", 100, 10, 4.5f, true, "Author 2", 300, "Publisher 2");
        book.displayDetails();

        WindowsLaptop windowsLaptop = new WindowsLaptop();

        Service service = new Service();
        service.validate(windowsLaptop);

        windowsLaptop.displayDetails();
        windowsLaptop.displayDetails("Microsoft");
        windowsLaptop.displayDetails("Microsoft",2020);
        windowsLaptop.displayDetails("Microsoft",2020,false);

        service.displayDetails(product2);
    }
}
