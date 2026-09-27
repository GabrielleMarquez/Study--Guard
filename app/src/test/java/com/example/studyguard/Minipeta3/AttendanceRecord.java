package com.example.studyguard.Minipeta3;

import java.util.Scanner;

public class AttendanceRecord {

    public void runAttendanceRecord(Scanner scanner) {

        System.out.println("=== ATTENDANCE RECORD ===");

        System.out.print("Enter student number: ");
        String studentNumber = scanner.nextLine();

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter attendance status: ");
        String status = scanner.nextLine();

        System.out.println("\n=== ATTENDANCE DETAILS ===");
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Status: " + status);
    }
}