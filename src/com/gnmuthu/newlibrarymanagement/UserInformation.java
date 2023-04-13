package com.gnmuthu.newlibrarymanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInformation {
    List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    void userEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User's Name");
        String userName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter User's Gender");
        String gender = scanner.next();
        scanner.nextLine();
        System.out.println("Enter Department");
        String department = scanner.next();
        scanner.nextLine();
        System.out.println("Enter User Id");
        String userId = scanner.next();

        User userEntry = new User(userName, gender, department, userId);
        users.add(userEntry);
        System.out.println("List of Available users");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).userName);
        }
    }

}

class User {
    String userName, gender, department, userId;

    User(String userName, String gender, String department, String userId) {
        this.userName = userName;
        this.gender = gender;
        this.department = department;
        this.userId = userId;
    }

}