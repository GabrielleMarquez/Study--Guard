package com.example.studyguard.Minipeta3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class    Logout {

    private String username;
    private boolean loggedIn;
    private LocalDateTime logoutTime;

    public Logout(String username) {
        this.username = username;
        this.loggedIn = true;
    }

    public void logout(Scanner scanner) {

        System.out.println("=== LOGOUT ===");

        System.out.print("Enter your username: ");
        String inputUsername = scanner.nextLine();

        if (inputUsername.equals(username)) {

            loggedIn = false;
            logoutTime = LocalDateTime.now();

            System.out.println("Logout Successful!");
            System.out.println("Goodbye, " + username + "!");
            System.out.println("Logout time: " + logoutTime);

        } else {

            System.out.println("Username does not match.");
            System.out.println("Logout Failed.");
        }
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}