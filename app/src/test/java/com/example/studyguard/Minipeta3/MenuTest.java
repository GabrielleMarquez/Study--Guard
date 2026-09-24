package com.example.studyguard.Minipeta3;

import com.example.studyguard.Minipeta3.Menu;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MenuTest {

    @Test
    public void testCompleteSystemFlow() {
        /*
         * 1. THE VIRTUAL KEYBOARD
         * A 'StringBuilder' acts as our virtual keyboard.
         * Instead of physically typing into the console, we will "append" (add)
         * every number or word the user would type into this builder.
         */
        StringBuilder simulatedUserInput = new StringBuilder();

        System.out.println("--- GENERATING SIMULATED USER INPUTS ---");

        /*
         * PART 1: Simulating Repetitive Tasks
         * We can use a while loop here to generate multiple inputs efficiently.
         * Think of this as a customer making 3 different orders or transactions.
         */
        int interactionCount = 1;
        while (interactionCount <= 3) {
            System.out.println("Generating inputs for interaction #" + interactionCount);

            if (interactionCount == 1) {
                // Simulating the user typing '1' and pressing ENTER.
                // IMPORTANT: The "\n" represents pressing the Enter key!
                simulatedUserInput.append("1\n");
            } else if (interactionCount == 2) {
                // Simulating the user choosing option '2', then typing '300'
                simulatedUserInput.append("2\n");
                simulatedUserInput.append("300\n");
            } else {
                // Simulating the user choosing option '2', then typing '5000'
                simulatedUserInput.append("2\n");
                simulatedUserInput.append("5000\n");
            }
            interactionCount++;
        }

        /*
         * PART 2: Simulating Sub-Menus or Specific Features
         * You don't always need a loop to test inputs. You can hardcode
         * a specific path the user takes through your menus.
         */
        System.out.println("Generating inputs for specific features...");
        simulatedUserInput.append("3\n");    // E.g., Enter a specific sub-menu (like Settings or Combo Meals)
        simulatedUserInput.append("1\n");    // E.g., Choose an option inside that sub-menu
        simulatedUserInput.append("9999\n"); // E.g., Type a specific value (like a PIN or a quantity)
        simulatedUserInput.append("3\n");    // E.g., Go back to the Main Menu

        /*
         * PART 3: Simulating the Exit Command
         * CRITICAL: You MUST send the exit number so your main 'while(isRunning)' loop stops.
         * If you don't, your program will keep asking for inputs, but the virtual keyboard
         * is empty, causing the test to crash!
         */
        System.out.println("Generating input to Exit the system...");
        simulatedUserInput.append("4\n"); // Change '4' to whatever your Exit option is!

        System.out.println("--- INPUT GENERATION COMPLETE ---\n");

        /*
         * 2. THE MAGIC CONVERSION
         * This converts our long string of inputs into an "InputStream".
         * It tricks Java into thinking this string is a hardware device like a keyboard.
         */
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedUserInput.toString().getBytes());

        /*
         * 3. THE AUTOMATED SCANNER
         * We give that stream to a normal Scanner. Now, whenever your code uses
         * scanner.nextInt() or scanner.nextLine(), it reads from our StringBuilder!
         */
        Scanner scanner = new Scanner(inputStream);

        /*
         * 4. RUNNING YOUR ACTUAL PROGRAM
         *
         */
        Menu mainSystem = new Menu();

        // Start your system and pass our automated scanner into it.
        mainSystem.start(scanner);
    }
}
