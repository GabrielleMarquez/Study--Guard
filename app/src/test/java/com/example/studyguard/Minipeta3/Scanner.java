package com.example.studyguard.Minipeta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // QR code input
        System.out.print("Enter QR code: ");
        String qrCode = scanner.nextLine();

        // Check QR code
        if (qrCode.equals("STUDENT123")) {

            System.out.println("QR Code Scanned Successfully!");
            System.out.println("Student Attendance: Present");

        } else {

            System.out.println("Invalid QR Code");

        }

        scanner.close();
    }
}