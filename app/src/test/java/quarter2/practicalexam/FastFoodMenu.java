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
            // =========================
            // EXIT
            // =========================
            else if (choice == 3) {

                System.out.println("\nProcessing your order...");
                break;

            }

            // =========================
            // INVALID
            // =========================
            else {

                System.out.println("Invalid choice!");
            }
        }

            // =========================
            // CALCULATIONS
            // =========================

        int totalItems =
                burgerComboQty +
                burgerSoloQty +
                friesQty;

        double burgerComboTotal = burgerComboQty * 85;
        double burgerSoloTotal = burgerSoloQty * 50;
        double friesTotal = friesQty * 35;

        double averagePrice = 0;

        if (totalItems > 0) {
            averagePrice = total / totalItems;
        }

           // =========================
           // ORDER SUMMARY
           // =========================

        System.out.println("\n=================================");
        System.out.println("          ORDER SUMMARY");
        System.out.println("=================================");

        if (burgerComboQty > 0) {
            System.out.println(
                    "Burger Combo x" + burgerComboQty +
                            " = ₱" + burgerComboTotal
            );
        }

        if (burgerSoloQty > 0) {
            System.out.println(
                    "Burger Solo  x" + burgerSoloQty +
                            " = ₱" + burgerSoloTotal
            );
        }

        if (friesQty > 0) {
            System.out.println(
                    "Fries        x" + friesQty +
                            " = ₱" + friesTotal
            );
        }

        System.out.println("---------------------------------");

        System.out.println("Total Items: " + totalItems);
        System.out.println("Subtotal: " + "₱" + total);

          // =========================
          // MOST ORDERED ITEM
          // =========================

        System.out.println("---------------------------------");
        System.out.println("ORDER INFORMATION");

        if (totalItems == 0) {

            System.out.println("No items ordered.");

        } else {

            if (burgerComboQty >= burgerSoloQty &&
                    burgerComboQty >= friesQty) {

                System.out.println("Most ordered: Burger Combo");

            } else if (burgerSoloQty >= burgerComboQty &&
                    burgerSoloQty >= friesQty) {

                System.out.println("Most ordered: Burger Solo");

            } else {

                System.out.println("Most ordered: Fries");
            }

            System.out.println(
                    "Average price per item: ₱" + averagePrice
            );
        }

          // =========================
          // ORDER STATUS
          // =========================

        System.out.println("---------------------------------");

        if (total > 0) {
            System.out.println("Order Status: READY");
        } else {
            System.out.println("Order Status: EMPTY");
        }

          // =========================
          // FINAL RECEIPT
          // =========================

        System.out.println("\n=================================");
        System.out.println("             RECEIPT");
        System.out.println("=================================");

        if (burgerComboQty > 0) {
        System.out.println(
                    "Burger Combo x" + burgerComboQty +
                            " = ₱" + burgerComboTotal
);
        }

                if (burgerSoloQty > 0) {
        System.out.println(
              "Burger Solo  x" + burgerSoloQty +
                      " = ₱" + burgerSoloTotal
);
        }

                if (friesQty > 0) {
                    System.out.println(
                            "Fries        x" + friesQty +
                                    " = ₱" + friesTotal
                    );
                }

        System.out.println("---------------------------------");
        System.out.println("Total Items: " + totalItems);
        System.out.println("TOTAL: ₱" + total);
        System.out.println("=================================");
        System.out.println("     THANK YOU FOR ORDERING!");
        System.out.println("=================================");
    }
}