package com.company;

/**
 * Created by joaoces on 05-09-2016.
 */
public class MyBook extends Book {

    int price;

    public MyBook(String t, String a, int price) {
        super(t, a);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
