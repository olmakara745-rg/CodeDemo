import java.util.Scanner;

/**
 * Simple demonstration of a while loop.
 * Reads an integer from the user and prints the numbers 1..N.
 */
public class whileDemo {
    public static void main(String[] args) {
        // 'count' is the loop counter; 'number' is the input limit.
        int count, number;

        // Prompt the user for an integer and read it from standard input.
        System.out.println("Enter a number");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        // Start counting from 1.
        count = 1; // loop variable

        // Loop while 'count' is less than or equal to the supplied number.
        while (count <= number) // control expression
        {
            // Print current value followed by a comma and space.
            System.out.print(count + ", ");
            // Increment the counter so the loop eventually terminates.
            count++; // increments count; eventually makes condition false
        }

        // Move to the next line after printing the sequence.
        System.out.println();
        System.out.println("Buckle my shoe.");

        // Close the scanner to free underlying resources.
        keyboard.close();
    }
}