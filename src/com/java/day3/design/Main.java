package com.java.day3.design;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book(1,"Atomic habits","james clear",true);
        library.addBook(book1);
    }
}
