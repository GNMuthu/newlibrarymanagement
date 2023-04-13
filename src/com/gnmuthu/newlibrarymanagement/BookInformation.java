package com.gnmuthu.newlibrarymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookInformation {

    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    void bookEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Book Title");
        String bookTitle = scanner.next();
        scanner.nextLine();
        System.out.println("Enter Author Name");
        String authorName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter Publishers Name");
        String publisherName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter Book Id");
        String bookId = scanner.next();

        Book myBooks = new Book(bookTitle, authorName, publisherName, bookId);
        books.add(myBooks);
        System.out.println("List of Available books:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).bookTitle);
        }

    }
}

class Book {
    String bookTitle, authorName, publisherName, bookId;

    Book(String bookTitle, String authorName, String publisherName, String bookId) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.bookId = bookId;

    }
}
