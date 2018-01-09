package com.library.model;

import java.util.Date;

public class BookOrder {

    private Book book;
    private Reader reader;
    private Date orderDate;
    private Date returnDate;

    public BookOrder() {
    }

    public BookOrder(Book book, Reader reader, Date orderDate, Date returnDate) {
        this.book = book;
        this.reader = reader;
        this.orderDate = orderDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}