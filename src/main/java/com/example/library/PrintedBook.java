package com.example.library;

// PrintedBook.java
public class PrintedBook implements Book {
    private final String title;
    private boolean borrowed = false; // must start false

    public PrintedBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() { return title; }
    @Override
    public boolean isAvailable() { return !borrowed; }

    @Override public void borrow() {
        if (borrowed) throw new IllegalStateException("Book already borrowed");
        borrowed = true;
    }

    @Override
    public void returnBook() { borrowed = false; }

    @Override
    public String toString() {
        return "PrintedBook{title='" + title + "', available=" + isAvailable() + "}";
    }
}
