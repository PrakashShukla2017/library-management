package com.example.library;

import java.util.ArrayList;
import java.util.List;

class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }

    public Book findAvailableBook(String title) {
        return books.stream()
                .filter(b -> b.getTitle().equals(title) && b.isAvailable())
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Book not available"));
    }
}
