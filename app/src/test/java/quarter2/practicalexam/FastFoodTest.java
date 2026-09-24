package quarter2.practicalexam;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class FastFoodTest {

    @Test

    public void testFastFoodFlow() {
        String input =
                "1\n2\n" +   // Burger x2
                        "2\n1\n" +   // Fries x1
                        "3\n1\n" +   // Chicken x1
                        "7\n" +      // Finish food ordering
                        "1\n2\n" +   // Extra Cheese x2
                        "1\n";       // Student Discount

        ByteArrayInputStream inputStream =
                new ByteArrayInputStream(input.getBytes());

        Scanner scanner = new Scanner(inputStream);

        start(scanner);
    }

    public void start(Scanner scanner) {

        double total = 0;

        int burgerQty = 0;
        int friesQty = 0;
        int chickenQty = 0;
        int spaghettiQty = 0;
        int sodaQty = 0;
        int iceCreamQty = 0;

        int extraCheeseQty = 0;
        int extraSauceQty = 0;

        int choice;

        while (true) {

            System.out.println("=== FAST FOOD MENU ===");
            System.out.println("1. Burger - ₱50");
            System.out.println("2. Fries - ₱35");
            System.out.println("3. Chicken - ₱80");
            System.out.println("4. Spaghetti - ₱60");
            System.out.println("5. Soda - ₱25");
            System.out.println("6. Ice Cream - ₱30");
            System.out.println("7. Order Summary");

            System.out.print("Choose an item: ");

            choice = scanner.nextInt();

            if (choice == 7) {
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            if (quantity <= 0) {
                System.out.println("Quantity must be greater than 0.");
                continue;
            }

            if (choice == 1) {

                burgerQty += quantity;
                total += 50 * quantity;
                System.out.println("Burger added!");

            } else if (choice == 2) {

                friesQty += quantity;
                total += 35 * quantity;
                System.out.println("Fries added!");

            } else if (choice == 3) {

                chickenQty += quantity;
                total += 80 * quantity;
                System.out.println("Chicken added!");

            } else if (choice == 4) {

                spaghettiQty += quantity;
                total += 60 * quantity;
                System.out.println("Spaghetti added!");

            } else if (choice == 5) {

                sodaQty += quantity;
                total += 25 * quantity;
                System.out.println("Soda added!");

            } else {
                iceCreamQty += quantity;
                total += 30 * quantity;
                System.out.println("Ice Cream added!");
            }

            System.out.println();
            System.out.println("=== ORDER SUMMARY ===");

            if (burgerQty > 0) {
                System.out.println("Burger x" + burgerQty +
                        " = ₱" + (burgerQty * 50));
            }

            if (friesQty > 0) {
                System.out.println("Fries x" + friesQty +
                        " = ₱" + (friesQty * 35));
            }

            if (chickenQty > 0) {
                System.out.println("Chicken x" + chickenQty +
                        " = ₱" + (chickenQty * 80));
            }

            if (spaghettiQty > 0) {
                System.out.println("Spaghetti x" + spaghettiQty +
                        " = ₱" + (spaghettiQty * 60));
            }

            if (sodaQty > 0) {
                System.out.println("Soda x" + sodaQty +
                        " = ₱" + (sodaQty * 25));
            }

            if (iceCreamQty > 0) {
                System.out.println("Ice Cream x" + iceCreamQty +
                        " = ₱" + (iceCreamQty * 30));
            }

            System.out.println("----------------------");
            System.out.println("TOTAL: ₱" + total);
        }

// ADD-ONS
        System.out.println();
        System.out.println("=== ADD-ONS ===");
        System.out.println("1. Extra Cheese - ₱15");
        System.out.println("2. Extra Sauce  - ₱10");
        System.out.println("3. No Add-on");

        System.out.print("Choose add-on: ");
        int addon = scanner.nextInt();

        if (addon == 1) {

            System.out.print("How many extra cheese? ");
            int qty = scanner.nextInt();

            if (qty > 0) {
                extraCheeseQty = qty;
                total += 15 * qty;
                System.out.println("Extra cheese added!");
            } else {
                System.out.println("Invalid quantity.");
            }

        } else if (addon == 2) {

            System.out.print("How many extra sauce? ");
            int qty = scanner.nextInt();

            if (qty > 0) {
                extraSauceQty = qty;
                total += 10 * qty;
                System.out.println("Extra sauce added!");
            } else {
                System.out.println("Invalid quantity.");
            }

        } else if (addon == 3) {

            System.out.println("No add-on selected.");

        } else {

            System.out.println("Invalid add-on choice.");
        }

        if (extraCheeseQty > 0) {
            System.out.println(
                    "Extra Cheese x" + extraCheeseQty +
                            " = ₱" + (extraCheeseQty * 15)
            );
        }

        if (extraSauceQty > 0) {
            System.out.println(
                    "Extra Sauce x" + extraSauceQty +
                            " = ₱" + (extraSauceQty * 10)
            );
        }

        System.out.println("----------------------");
        System.out.println("FINAL TOTAL: ₱" + total);

        // DISCOUNT
        double discountRate;
        double discount;

        System.out.println("\n=================================");
        System.out.println("            DISCOUNT");
        System.out.println("=================================");
        System.out.println("1. Student Discount - 10%");
        System.out.println("2. Senior Discount  - 20%");
        System.out.println("3. No Discount");

        System.out.print("Choose discount: ");
        int discountChoice = scanner.nextInt();

        if (discountChoice == 1) {

            discountRate = 0.10;
            System.out.println("Student discount applied.");

        } else if (discountChoice == 2) {

            discountRate = 0.20;
            System.out.println("Senior discount applied.");

        } else if (discountChoice == 3) {

            discountRate = 0.00;
            System.out.println("No discount applied.");

        } else {

            System.out.println("Invalid discount choice. No discount applied.");
            discountRate = 0.00;
        }

// MATH
        discount = total * discountRate;

        double finalTotal = total - discount;


// RECEIPT
        System.out.println("\n=================================");
        System.out.println("             RECEIPT");
        System.out.println("=================================");

        if (burgerQty > 0) {
            System.out.println("Burger        x" + burgerQty +
                    " = ₱" + (burgerQty * 50));
        }

        if (friesQty > 0) {
            System.out.println("Fries         x" + friesQty +
                    " = ₱" + (friesQty * 35));
        }

        if (chickenQty > 0) {
            System.out.println("Chicken       x" + chickenQty +
                    " = ₱" + (chickenQty * 80));
        }

        if (spaghettiQty > 0) {
            System.out.println("Spaghetti     x" + spaghettiQty +
                    " = ₱" + (spaghettiQty * 60));
        }

        if (sodaQty > 0) {
            System.out.println("Soda          x" + sodaQty +
                    " = ₱" + (sodaQty * 25));
        }

        if (iceCreamQty > 0) {
            System.out.println("Ice Cream     x" + iceCreamQty +
                    " = ₱" + (iceCreamQty * 30));
        }

        if (extraCheeseQty > 0) {
            System.out.println("Extra Cheese  x" + extraCheeseQty +
                    " = ₱" + (extraCheeseQty * 15));
        }

        if (extraSauceQty > 0) {
            System.out.println("Extra Sauce   x" + extraSauceQty +
                    " = ₱" + (extraSauceQty * 10));
        }

        System.out.println("---------------------------------");
        System.out.println("Subtotal:  ₱" + total);
        System.out.println("Discount:  ₱" + discount);
        System.out.println("TOTAL:     ₱" + finalTotal);
        System.out.println("=================================");
    }
}