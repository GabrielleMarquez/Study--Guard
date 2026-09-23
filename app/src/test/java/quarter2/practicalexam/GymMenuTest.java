package quarter2.practicalexam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class GymMenuTest {

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
                    System.out.println("Enter Gym");
                    break;

                case 2:
                    System.out.println("Hire Trainer");
                    break;

                case 3:
                    System.out.println("Exit");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;

            }
        }
    }

    @Test
    public void testGymFlow() {

        System.out.println("--- GENERATING GYM TEST DATA ---");

        StringBuilder automatedInput = new StringBuilder();

        // Step 1: Enter gym floor option
        automatedInput.append("1\n"); //Choose Enter Gym

        // Step 2: Test VIP membership tier (Level 1)
        automatedInput.append("2\n"); //Choose Hire Trainer
        automatedInput.append("1\n"); //Enter Level 1 (Expected: Trainer Assigned)

        //Step 3: Test Basic membership tier (Level 2)
        automatedInput.append("2\n"); //Choose Hire Trainer
        automatedInput.append("2\n"); //Enter Level 2 (Expected: Upgrade Required)

        //Step 4: Exit system
        automatedInput.append("3\n"); //Choose Exit

        System.out.println("--- TEST DATA GENERATION COMPLETED ---\n");

        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());

        Scanner scanner = new Scanner(inputStream);

        GymMenuTest gymSystem = new GymMenuTest ();

        gymSystem.start(scanner);

        scanner.close();

    }
}
