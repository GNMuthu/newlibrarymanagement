package com.gnmuthu.newlibrarymanagement;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookTransactions {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, String> map = new HashMap<>();

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
        String usersId = scanner.nextLine();
        System.out.println("Enter the Book id for Borrow:");
        String booksId = scanner.nextLine();

        for (User userElement : borrower) {
            if (userElement.userId.equals(usersId)) {
                userVerification = true;
                break;
            }
        }
        for (Book bookElement : bookBorrow) {
            if (bookElement.bookId.equals(booksId)) {
                bookVerification = true;
                break;
            }
        }

        if (userVerification && bookVerification) {
            map.put(usersId, booksId);
        }

        for (Map.Entry<String, String> userBook : map.entrySet()) {
            System.out.println(userBook.getKey() + " " + userBook.getValue());

        }
    }

}
