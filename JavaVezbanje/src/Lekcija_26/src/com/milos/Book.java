package com.milos;

import java.io.Serializable;

public class Book implements Serializable {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public Book() {
    }
}
