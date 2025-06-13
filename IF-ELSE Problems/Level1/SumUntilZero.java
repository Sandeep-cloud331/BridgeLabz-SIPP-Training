import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Initialize the total sum to 0.0
        double total = 0.0;

        // Variable to store user input
        double number;

        // Prompt the user to start entering numbers
        System.out.println("Enter numbers to add to the total (enter 0 to stop)");

        // Use a while loop to keep accepting input until 0 is entered
        while (true) {
            // Take input from the user
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            // Check if the entered number is 0
            if (number == 0.0) {
                break; // Exit the loop if user enters 0
            }

            // Add the input number to the total
            total += number;
        }

        // Display the final total sum
        System.out.println("The total sum of entered numbers is: " + total);

        // Close the input
        input.close();
    }
}
