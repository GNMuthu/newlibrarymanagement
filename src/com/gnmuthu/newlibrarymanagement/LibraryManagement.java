package com.gnmuthu.newlibrarymanagement;

import java.util.Objects;
import java.util.Scanner;

public class LibraryManagement {
    BookInformation bookInformation = new BookInformation();
    UserInformation userInformation = new UserInformation();
    BookTransactions bookTransactions = new BookTransactions();

    void Init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Name");
        String adminUserName = scanner.nextLine();
        System.out.println("Enter Password");
        String adminPassword = scanner.nextLine();
        if (Objects.equals(adminUserName, "nadimuthu") && adminPassword.equals("12345")) {
            while (true) {
                System.out.println("Enter any one option from list ");
                System.out.println("1. Book Entry");
                System.out.println("2. User Entry");
                System.out.println("3. Borrow Books");
                System.out.println("4. Exit");
                int option = scanner.nextInt();
                switch (option) {
                    case 1 -> bookInformation.bookEntry();
                    case 2 -> userInformation.userEntry();
                    case 3 -> bookTransactions.borrowBook(bookInformation, userInformation);
                    case 4 -> System.exit(0);
                    default -> System.out.println("enter the correct option...");
                }
            }
        } else
            System.out.println("Either User Name or Password is  in-correct");
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        library.Init();
    }
}
