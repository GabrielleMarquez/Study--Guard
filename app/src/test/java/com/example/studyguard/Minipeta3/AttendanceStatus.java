package com.example.studyguard.Minipeta3;

import java.util.Scanner;

public class AttendanceStatus {

    private String studentAttendanceStatus;

    public AttendanceStatus(String studentAttendanceStatus) {
        this.studentAttendanceStatus = studentAttendanceStatus;
    }

    public String getStudentAttendanceStatus() {
        return studentAttendanceStatus;
    }

    public void setStudentAttendanceStatus(String studentAttendanceStatus) {
        this.studentAttendanceStatus = studentAttendanceStatus;
    }

    public void displayAttendanceStatus() {
        System.out.println("Attendance Status: " + studentAttendanceStatus);
    }

    // Accept the Scanner from the caller
    public void runAttendanceStatus(Scanner scanner) {

        System.out.print("Enter attendance status (Present/Late/Absent): ");
        String status = scanner.nextLine();

        // Create object
        AttendanceStatus studentRecord = new AttendanceStatus(status);

        // Display attendance status
        studentRecord.displayAttendanceStatus();

        // Check attendance status
        if (status.equalsIgnoreCase("Present")) {
            System.out.println("Student is present.");
        } else if (status.equalsIgnoreCase("Late")) {
            System.out.println("Student is late.");
        } else if (status.equalsIgnoreCase("Absent")) {
            System.out.println("Student is absent.");
        } else {
            System.out.println("Invalid attendance status.");
        }
    }
}