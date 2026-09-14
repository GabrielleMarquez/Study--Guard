package com.example.studyguard.Minipeta3;


public class Login {

        public static void main(String[] args) {

            String username = "student";
            String password = "12345";

            System.out.println("===== STUDY GUARD LOGIN =====");
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

            if (username.equals("student") && password.equals("12345")) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid Username or Password!");
            }
        }
    }
}