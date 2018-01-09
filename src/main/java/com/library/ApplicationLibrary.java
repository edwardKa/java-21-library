package com.library;

import com.library.model.Book;

import java.util.UUID;

public class ApplicationLibrary {

    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("Refactoring");
        book.setId(UUID.randomUUID().toString());
        book.setIssueYear(1999);


        System.out.println(book.toString());


    }
}
