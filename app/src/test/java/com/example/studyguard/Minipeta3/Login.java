package com.example.studyguard.Minipeta3;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        //username and password
        String correctUsername = "123";
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        //User input
        System.out.print("Enter student number: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        //Check studetnt credentials if correct
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.print("Logged In Successfully");

        } else {
            System.out.print("Invalid Username or Password");

        }

        scanner.close();
    }
}
