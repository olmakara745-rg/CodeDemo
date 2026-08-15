
/*OL MAKARA
*14_08_2026
*/
import java.util.Scanner;

/**
 * RoachPopulation - Calculates how long it takes for a roach population
 * to fill a house based on weekly growth rates.
 * 
 * This program simulates roach population growth where:
 * - Each roach occupies 0.002 cubic feet
 * - Each week, population grows by 95%
 * - Simulation continues until roaches fill the house
 */
public class RoachPopulation {

    /** Growth rate per week (95% more roaches) */
    public static final double GROWTH_RATE = 0.95;

    /** Volume occupied by a single roach in cubic feet */
    public static final double ONE_BUG_VOLUME = 0.002;

    /**
     * Main method - Simulates roach population growth in a house.
     * Prompts user for house volume and initial roach population,
     * then calculates how many weeks until roaches fill the house.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {

        // Input scanner
        Scanner keyboard = new Scanner(System.in);

        // Variable declarations
        double houseVolume; // Size of the house in cubic feet
        double startPopulation; // Initial number of roaches
        int countWeeks; // Number of weeks elapsed
        double population; // Current roach population
        double totalBugVolume; // Total volume occupied by roaches
        double newBugs; // New roaches born this week
        double newBugVolume; // Volume of new roaches

        // 1. Read house volume from user
        System.out.print("Enter the volume of the house (cubic feet): ");
        houseVolume = keyboard.nextDouble();

        // 2. Read initial number of roaches
        System.out.print("Enter the starting number of roaches: ");
        startPopulation = keyboard.nextDouble();

        // 3. Initialize population to starting value
        population = startPopulation;

        // 4. Calculate initial total roach volume
        totalBugVolume = population * ONE_BUG_VOLUME;

        // 5. Initialize week counter
        countWeeks = 0;

        // 6. Simulate population growth each week until house is full
        while (totalBugVolume < houseVolume) {

            // Calculate new roaches born this week (95% growth)
            newBugs = population * GROWTH_RATE;

            // Calculate volume of new roaches
            newBugVolume = newBugs * ONE_BUG_VOLUME;

            // Update total population
            population = population + newBugs;

            // Update total volume occupied
            totalBugVolume = totalBugVolume + newBugVolume;

            // Increment week counter
            countWeeks++;
        }

        // 7. Display final results
        System.out.println("\n===== ROACH POPULATION RESULT =====");
        System.out.println("Starting population: " + startPopulation);
        System.out.println("House volume: " + houseVolume + " cubic feet");
        System.out.println("Number of weeks: " + countWeeks);
        System.out.println("Final roach population: " + population);
        System.out.println("Total roach volume: " + totalBugVolume + " cubic feet");

        // Close scanner to free resources
        keyboard.close();
    }
}