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
        }
        int choice = scanner.nextInt();

        switch (choice) {
        }
    }
}