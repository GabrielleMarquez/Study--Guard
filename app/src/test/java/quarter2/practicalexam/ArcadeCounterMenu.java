package quarter2.practicalexam;

import java.util.Scanner;

public class ArcadeCounterMenu {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("\n===== ARCADE COUNTER =====");
            System.out.println("1. Buy Tokens");
            System.out.println("2. Claim Prize");
            System.out.println("3. Exit System");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- BUY TOKENS ---");
                    System.out.println("Tokens purchased successfully!");
                    break;

                case 2:
                    System.out.println("\n--- CLAIM PRIZE ---");
                    System.out.print("Enter number of tickets: ");

                    int tickets = scanner.nextInt();

                    if (tickets >= 500) {
                        System.out.println("Congratulations!");
                        System.out.println("Teddy Bear Won!");
                    } else {
                        System.out.println("Not enough tickets.");
                        System.out.println("Keep Playing!");
                    }

                    break;

                case 3:
                    System.out.println("\nExiting Arcade Counter...");
                    running = false;
                    break;

                default:
                    System.out.println("\nInvalid choice!");
                    break;

            }
        }
    }
}