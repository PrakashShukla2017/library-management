package com.example.library;

public interface Book {

    String getTitle();
    boolean isAvailable();
    void borrow();
    void returnBook();
}
