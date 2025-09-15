package com.example.library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Library library = new Library();

        Book book = new PrintedBook("Effective Java");
        Book book1 = new PrintedBook("Head First Java");

        library.addBook(book);
        library.addBook(book1);

        System.out.println("book added successfully");

        try{
            Book avilableBook = library.findAvailableBook("Effective Java");
            System.out.println("Book is available :" +avilableBook);
        }
        catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }


    }
}