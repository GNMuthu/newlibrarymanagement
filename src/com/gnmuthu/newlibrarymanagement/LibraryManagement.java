package com.gnmuthu.newlibrarymanagement;

import java.util.Objects;
import java.util.Scanner;

public class LibraryManagement {
    private final BookInformation bookInformation = new BookInformation();
    private final UserInformation userInformation = new UserInformation();
    private final BookTransactions bookTransactions = new BookTransactions();
    private final Scanner scanner = new Scanner(System.in);

    /**
     * this method is used for get the username and password for verification
     */
    void Init() {
        System.out.println("Enter User Name");
        String adminUserName = scanner.nextLine();
        System.out.println("Enter Password");
        String adminPassword = scanner.nextLine();
        if (Objects.equals(adminUserName, "nadimuthu") && adminPassword.equals("12345")) {
            listOption();
        } else
            System.out.println("Either User Name or Password is  in-correct");
    }

    /**
     * after verification of username and password this method will be called and shows the list to users
     */
    private void listOption() {
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
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        library.Init();
    }

    public static class OnBooksSelectedListener {

    }
}
