package com.example.studyguard.Minipeta3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctQRCode = "ROOM101";

        System.out.println("===== QR CODE SCANNER =====");
        System.out.println("Scan the QR code to enter the room.");

        System.out.print("Enter scanned QR code: ");
        String qrCode = input.nextLine();

        if (qrCode.equalsIgnoreCase(correctQRCode)) {

            System.out.println("\nQR code scanned successfully!");
            System.out.println("Access granted!");
            System.out.println("Welcome to Room 101.");

            System.out.print("\nEnter student ID: ");
            String studentID = input.nextLine();

            System.out.println("\n===== ATTENDANCE =====");
            System.out.println("Student ID: " + studentID);
            System.out.println("Attendance recorded.");
            System.out.println("Status: PRESENT");

        } else {System.out.println("\nInvalid QR code!");
            System.out.println("Access denied.");
            System.out.println("Please scan the correct room QR code.");
        }

        input.close();
    }
}