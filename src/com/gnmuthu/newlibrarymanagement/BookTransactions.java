package com.gnmuthu.newlibrarymanagement;


import java.util.*;

import com.gnmuthu.newlibrarymanagement.BookInformation;
import com.gnmuthu.newlibrarymanagement.UserInformation;

public class BookTransactions {
    Scanner scanner = new Scanner(System.in);

    void borrowBook(BookInformation bookInformation, UserInformation userInformation) {

        List<Book> bookBorrow = bookInformation.getBooks();
        List<User> borrower = userInformation.getUsers();
        System.out.println("Information from Borrow Books...");
        System.out.println("Book Info:");
        for (Book book : bookBorrow) {
            System.out.println(book.bookId + " " + book.bookTitle);
        }
        System.out.println("User Info");
        for (User user : borrower) {
            System.out.println(user.userId + " " + user.userName);
        }
        mapData(bookInformation, userInformation);
    }

    void mapData(BookInformation bookInformation, UserInformation userInformation) {
        boolean userVerification = false;
        boolean bookVerification = false;
        List<Book> bookBorrow = bookInformation.getBooks();
        List<User> borrower = userInformation.getUsers();
        System.out.println("Enter the User Id:");
        String usersId = scanner.next();
        System.out.println("Enter the Book id for Borrow:");
        String booksId = scanner.next();
        Map<String, String> map = new HashMap<>();
        for (User userElement : borrower) {
            if (userElement.userId.equals(usersId)) {
                userVerification = true;
            }
        }
        for (Book bookElement : bookBorrow) {
            if (bookElement.bookId.equals(booksId)) {
                bookVerification = true;
            }
        }

        if(userVerification && bookVerification)
        {
            map.put(usersId,booksId);
        }

        for (Map.Entry<String, String> userBook : map.entrySet()) {
            System.out.println(userBook.getKey() + " " + userBook.getValue());

        }
    }

}
