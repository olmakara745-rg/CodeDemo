import java.util.Scanner;

/**
 * BooleanDemo - Demonstrates the use of boolean variables to control program
 * flow.
 * OL MAKARA
 * 14_08_2026
 * <p>
 * This program:
 * <ul>
 * <li>Reads a series of nonnegative integers from the user</li>
 * <li>Uses a boolean flag to control a while loop</li>
 * <li>Terminates input when a negative number is entered</li>
 * <li>Displays the sum of all entered nonnegative numbers</li>
 * </ul>
 * 
 * @author Course Materials
 * @version 1.0
 */
public class BooleanDemo {
    /**
     * Main method - Demonstrates boolean flag usage for loop control.
     * 
     * <p>
     * Algorithm:
     * 1. Prompts user to enter nonnegative numbers
     * 2. Uses a boolean flag (areMore) to control the while loop
     * 3. Reads integers and accumulates their sum
     * 4. Exits loop when negative number is detected
     * 5. Displays the final sum
     * 
     * <p>
     * Uses try-finally to ensure Scanner is properly closed.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        // Display input instructions to user
        System.out.println("Enter nonnegative numbers.");
        System.out.println("Place a negative number at the end");
        System.out.println("to server as an end marker.");

        // Initialize sum accumulator
        int sum = 0;

        // Boolean flag to control loop continuation
        boolean areMore = true;

        // Create Scanner for reading user input
        Scanner keyboard = new Scanner(System.in);
        try {
            // Loop continues while areMore flag is true
            while (areMore) {
                // Read next integer from user
                int next = keyboard.nextInt();

                // Check if input is negative (end marker)
                if (next < 0)
                    // Set boolean flag to false to exit loop
                    areMore = false;
                else
                    // Add nonnegative number to running sum
                    sum = sum + next;
            }

            // Display the accumulated sum
            System.out.println("The sum of the numbers is " + sum);
        } finally {
            // Ensure Scanner is closed to free resources
            // Ensure Scanner is closed to free resources
            keyboard.close();
        }
    }
}
