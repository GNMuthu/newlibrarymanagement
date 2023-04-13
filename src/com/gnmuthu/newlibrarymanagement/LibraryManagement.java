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
        String adminUserName = scanner.next();
        System.out.println("Enter Password");
        String adminPassword = scanner.next();
        if (Objects.equals(adminUserName, "nadimuthu") && adminPassword.equals("12345")) {
            boolean flag = false;
            while (true) {
                System.out.println("Enter any one option from list ");
                System.out.println("1. Book Entry");
                System.out.println("2. User Entry");
                System.out.println("3. Borrow Books");
                System.out.println("4. Exit");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        bookInformation.bookEntry();
                        break;
                    case 2:
                        userInformation.userEntry();
                        break;
                    case 3:
                        bookTransactions.borrowBook(bookInformation, userInformation);
                        break;
                    case 4:
                        flag = true;
                        System.exit(0);
                        break;
                    default:
                        System.out.println("enter the correct option...");
                        break;
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
