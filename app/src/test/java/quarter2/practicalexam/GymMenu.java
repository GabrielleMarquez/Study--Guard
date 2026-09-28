package quarter2.practicalexam;

import java.util.Scanner;

public class GymMenu {

    public static void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("===== GYM ACCESS SYSTEM =====");
            System.out.println("1. Enter Gym");
            System.out.println("2. Hire Trainer");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("You entered the gym");
                    break;

                case 2:
                    System.out.println("\n === MEMBERSHIP LEVEL ===");
                    System.out.println("1. VIP Membership");
                    System.out.println("2. Basic Membership");
                    System.out.print("Choose a membership level: ");

                    int level = scanner.nextInt();

                    if (level == 1) {
                        System.out.println("Trainer assigned");
                    } else if (level == 2) {
                        System.out.println("Upgrade required");
                    } else {
                        System.out.println("Invalid membership level");
                    }

                    break;

                case 3:
                    System.out.println("Thank you for using the Gym Access System!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }
    }
}
