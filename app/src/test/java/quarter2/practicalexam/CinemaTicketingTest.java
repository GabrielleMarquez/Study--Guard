package quarter2.practicalexam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CinemaTicketingTest {

    @Test
    public void testCinemaFlow() {
        StringBuilder automatedInput = new StringBuilder();

        System.out.println("--- GENERATING CINEMA TEST DATA ---");

        // Step 1: Test underage restriction (< 18)
        automatedInput.append("1\n"); // Choose Buy Ticket
        automatedInput.append("15\n"); // Enter age 15 (Expected: Access Denied)

        // Step 2: Test legal age access (>= 18)
        automatedInput.append("1\n"); // Choose Buy Ticket
        automatedInput.append("20\n"); // Enter age 20 (Expected: Ticket Printed)

        // Step 3: Test snack purchase
        automatedInput.append("2\n"); // Choose Buy Snacks

        // Step 4: Exit system
        automatedInput.append("3\n"); // Choose Exit

        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");

        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);
        CinimaTicketingMenu cinemaSystem = new
                CinimaTicketingMenu();
        cinemaSystem.start(scanner);
    }
}