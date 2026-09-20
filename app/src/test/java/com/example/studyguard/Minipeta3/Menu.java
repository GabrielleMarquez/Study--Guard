package com.example.studyguard.Minipeta3;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println();
            System.out.println("===== STUDY GUARD =====");
            System.out.println("1. Scanner");
            System.out.println("2. Attendance Record");
            System.out.println("3. Attendance Status");
            System.out.println("4. Settings");
            System.out.println("5. Log Out");
            System.out.print("Choose: ");

            choice = input.nextInt();

            if (choice == 1) {

                System.out.println();
                System.out.println("===== SCANNER =====");
                System.out.print("Enter student name: ");

                input.nextLine();
                String name = input.nextLine();

                System.out.println("Scanning...");
                System.out.println(name + " scanned successfully!");

            } else if (choice == 2) {

                System.out.println();
                System.out.println("===== ATTENDANCE RECORD =====");

                System.out.print("Enter number of students: ");
                int students = input.nextInt();

                int present = 0;
                int absent = 0;
                int late = 0;

                for (int i = 1; i <= students; i++) {

                    System.out.print("Student " + i + " (P/A/L): ");
                    String attendance = input.next();

                    if (attendance.equalsIgnoreCase("P")) {
                        present++;
                    } else if (attendance.equalsIgnoreCase("A")) {
                        absent++;
                    } else if (attendance.equalsIgnoreCase("L")) {
                        late++;
                    } else {
                        System.out.println("Invalid input! Enter P, A, or L.");
                        i--;
                    }
                }

                System.out.println();
                System.out.println("===== ATTENDANCE SUMMARY =====");
                System.out.println("Present: " + present);
                System.out.println("Absent: " + absent);
                System.out.println("Late: " + late);

            } else if (choice == 3) {

                System.out.println();
                System.out.println("===== ATTENDANCE STATUS =====");
                System.out.println("Present - Student is in class");
                System.out.println("Absent - Student is not in class");
                System.out.println("Late - Student arrived late");

            } else if (choice == 4) {

                System.out.println();
                System.out.println("===== SETTINGS =====");
                System.out.println("Settings opened.");

            } else if (choice == 5) {

                System.out.println();
                System.out.println("Logged out successfully!");
                System.out.println("Thank you for using Study Guard.");

            } else {

                System.out.println();
                System.out.println("Invalid choice!");

            }

        } while (choice != 5);

        input.close();
    }
}
