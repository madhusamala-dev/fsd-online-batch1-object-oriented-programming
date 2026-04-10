package com.java.oop.collection;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add("madhu");
        set.add("john");
        set.add(1);
        set.add("john");

        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains(10));
        set.remove(1);
        System.out.println(set);

        set.add("abcd");
        set.add(345345);

        System.out.println(set);

        int[] ids = {1,2,3,4};
        for(int id : ids) {
            System.out.println(id);
        }

        //iterator
        /*Iterator iterator = set.iterator();
        //hasNext() -> check if there is next element
        //next() -> get next element
        while(iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println(name.toUpperCase());
        }*/

        Set<String> names = new HashSet<>();
        names.add("madhu");
        names.add("atmos");
        names.add("john");
        names.add("john");
        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name.toUpperCase());
        }

        Set<String> emails = new TreeSet<>();
        emails.add("madhu@gmail.com");
        emails.add("john@gmail.com");
        emails.add("sushmita@gmail.com");
        emails.add("harita@gmail.com");

        System.out.println(emails);

    }
}
