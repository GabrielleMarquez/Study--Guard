package quarter2.practicalexam.Gym;
import java.util.Scanner;

public class GymMenu {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("===== GYM ACCESS SYSTEM =====");
            System.out.println("1. Enter Gym");
            System.out.println("2. Hire Trainer");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("You entered the gym");
                    break;

                case 2:
                    System.out.println("\n--- MEMBERSHIP LEVEL ---");
                    System.out.println("1. VIP Membership");
                    System.out.println("2. Basic Membership");
                    System.out.println("Choose membership level: ");

                    int level = scanner.nextInt();

                    if (level == 1) {
                        System.out.println("Trainer assigned succesfully!");
                    }
                    else if (level == 2) {
                        System.out.println("Upgrade your membership to hire a trainer");
                    }
                    else {
                        System.out.println("Invalid membership level.");
                    }
                    break;

            }




        }
    }
}
