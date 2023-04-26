package com.gnmuthu.newlibrarymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookInformation {

    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    void bookEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Book Title");
        String bookTitle = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Enter Author Name");
        String authorName = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Enter Publishers Name");
        String publisherName = scanner.nextLine();
//        scanner.nextLine();
        System.out.println("Enter Book Id");
        String bookId = scanner.nextLine();

        Book myBooks = new Book(bookTitle, authorName, publisherName, bookId);
        books.add(myBooks);
        System.out.println("List of Available books:");
        for (Book book : books) {
            System.out.println(book.bookTitle);
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
