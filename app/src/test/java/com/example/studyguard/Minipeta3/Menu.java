package com.example.studyguard.Minipeta3;

import java.util.Scanner;

public class Menu {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("=================================");
            System.out.println("          STUDY GUARD");
            System.out.println("=================================");
            System.out.println("1. Login");
            System.out.println("2. Attendance");
            System.out.println("3. Settings");
            System.out.println("4. Exit");
            System.out.println("=================================");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.println();
                System.out.println("Login selected.");
                System.out.println("Opening Login...");

            } else if (choice == 2) {

                System.out.println();
                System.out.println("Attendance selected.");
                System.out.println("Opening Attendance...");

            } else if (choice == 3) {

                System.out.println();
                System.out.println("Settings selected.");
                System.out.println("Opening Settings...");

            } else if (choice == 4) {

                System.out.println();
                System.out.println("Thank you for using Study Guard!");
                running = false;

            } else {

                System.out.println();
                System.out.println("Invalid choice!");
                System.out.println("Please choose 1-4.");
            }
        }
    }
}
