package com.company;

/**
 * Created by joaoces on 05-09-2016.
 */
public abstract class Book {
    String title;
    String author;

    public Book(String t,String a){
        title=t;
        author=a;
    }

    abstract void display();

}
