package com.example.library;

public class Ebook implements Book {

    private final String title;
    private boolean licensed = true;

    public Ebook(String title){
        this.title =title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isAvailable() {
        return licensed;
    }

    @Override
    public void borrow() {
    if(!licensed){
        throw new IllegalStateException("Ebook license already used or expired");
    }
    licensed = false;
    System.out.println("Ebook borrowed: " + title + " (license consumed)");
    }

    @Override
    public void returnBook() {
     licensed = true;
     System.out.println("Ebook returned: " + title + " (license consumed)");
    }

    @Override
    public String toString() {
        return "PrintedBook{title='" + title + "', available=" + isAvailable() + "}";
    }
}
