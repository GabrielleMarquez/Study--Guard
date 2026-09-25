package quarter2.practicalexam;

import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
public class FastFoodTest {
    @Test

    public void testFastFoodFlow() {
        StringBuilder automatedInput = new StringBuilder();
        System.out.println("--- GENERATING FAST FOOD TEST DATA ---");
// Step 1: Order Burger as Combo (Nested option 1)
        automatedInput.append("1\n"); // Choose Order Burger
        automatedInput.append("1\n"); // Choose Combo upgrade
// Step 2: Order Burger as Solo (Nested option 2)
        automatedInput.append("1\n"); // Choose Order Burger
        automatedInput.append("2\n"); // Choose Solo
// Step 3: Order Fries option
        automatedInput.append("2\n"); // Choose Order Fries
// Step 4: Exit system
        automatedInput.append("3\n"); // Choose Exit
        System.out.println("--- TEST DATA GENERATION COMPLETE ---\n");
        ByteArrayInputStream inputStream = new ByteArrayInputStream(automatedInput.toString().getBytes());
        Scanner scanner = new Scanner(inputStream);

        FastFoodMenu fastFoodSystem = new FastFoodMenu();
        fastFoodSystem.start(scanner);
    }
}