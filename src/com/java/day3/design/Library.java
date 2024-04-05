package com.java.day3.design;

import java.util.HashSet;
import java.util.Set;

public class Library {
    public Set<Book> bookLst;
    public Library(){
        bookLst = new HashSet<>();
    }

    public void addBook(Book book){
        bookLst.add(book);
    }

    public void removeBook(Book book){
        bookLst.remove(book);
    }

    public void getAllBooks(){
        bookLst.forEach(System.out::println);
    }
}
