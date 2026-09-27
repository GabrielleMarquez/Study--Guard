package com.example.studyguard.Minipeta3;

import java.util.Scanner;

public class Settings {

    private boolean notifications = true;
    private boolean running = true;

    public void settings(Scanner scanner) {

        running = true;

        while (running) {

            System.out.println("\n--- SETTINGS ---");
            System.out.println("1. Log Out");
            System.out.println("2. Change Password");
            System.out.println("3. Notifications: "
                    + (notifications ? "ON" : "OFF"));
            System.out.println("4. Language");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print(
                            "Are you sure you want to log out? (yes/no): "
                    );

                    String answer = scanner.nextLine();

                    if (answer.equalsIgnoreCase("yes")) {
                        System.out.println(
                                "Logged out successfully!"
                        );
                        running = false;
                    } else {
                        System.out.println(
                                "Logout cancelled."
                        );
                    }
                    break;

                case 2:
                    System.out.print("Enter new password: ");
                    String password = scanner.nextLine();

                    System.out.println(
                            "Password changed successfully!"
                    );
                    break;

                case 3:
                    notifications = !notifications;

                    System.out.println(
                            "Notifications are now "
                                    + (notifications ? "ON" : "OFF")
                    );
                    break;

                case 4:
                    System.out.println("\n--- LANGUAGE ---");
                    System.out.println("1. English");
                    System.out.println("2. Filipino");
                    System.out.println("3. Spanish");
                    System.out.print("Select language: ");

                    int language = scanner.nextInt();
                    scanner.nextLine();

                    if (language == 1) {
                        System.out.println(
                                "Language set to English."
                        );

                    } else if (language == 2) {
                        System.out.println(
                                "Language set to Filipino."
                        );

                    } else if (language == 3) {
                        System.out.println(
                                "Language set to Spanish."
                        );

                    } else {
                        System.out.println(
                                "Invalid language."
                        );
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}