package com.example.studyguard.Minipeta3;

import java.util.Scanner;

public class AttendanceRecord {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int present = 0;
            int absent = 0;
            int late = 0;

            System.out.print("Enter the number of students: ");
            int students = input.nextInt();
            input.nextLine(); // Clear buffer

            for (int i = 1; i <= students; i++) {

                System.out.print("Student " + i +
                        " (P = Present, A = Absent, L = Late): ");

                String attendance = input.nextLine();

                if (attendance.equalsIgnoreCase("P")) {
                    present++;

                } else if (attendance.equalsIgnoreCase("A")) {
                    absent++;

                } else if (attendance.equalsIgnoreCase("L")) {
                    late++;

                } else {
                    System.out.println("Invalid input! Please enter P, A or L.");
                    i--; // Repeat the current student
                }
            } // closes the for loop

            System.out.println("Attendance Summary");
            System.out.println("Present: " + present);
            System.out.println("Absent: " + absent);
            System.out.println("Late: " + late);

            input.close();
        }
    }
}
