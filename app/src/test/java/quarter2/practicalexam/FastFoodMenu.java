package quarter2.practicalexam;

import java.util.Scanner;

public class FastFoodMenu {

    public void start(Scanner scanner) {

        double total = 0;

        int burgerComboQty = 0;
        int burgerSoloQty = 0;
        int friesQty = 0;

        while (true) {

            System.out.println("\n=== FAST FOOD MENU ===");
            System.out.println("1. Order Burger");
            System.out.println("2. Order Fries");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            // =========================
            // BURGER
            // =========================
            if (choice == 1) {

                System.out.println("\n=== BURGER OPTIONS ===");
                System.out.println("1. Combo - ₱85");
                System.out.println("2. Solo  - ₱50");

                System.out.print("Choose Burger type: ");
                int burgerChoice = scanner.nextInt();

                if (burgerChoice == 1) {

                    burgerComboQty++;
                    total += 85;

                    System.out.println("Burger Combo added!");

                } else if (burgerChoice == 2) {

                    burgerSoloQty++;
                    total += 50;

                    System.out.println("Burger Solo added!");

                } else {

                    System.out.println("Invalid Burger option.");
                }
            }

            // =========================
            // FRIES
            // =========================
            else if (choice == 2) {

                friesQty++;
                total += 35;

                System.out.println("Fries added!");

            }
        }
    }
}