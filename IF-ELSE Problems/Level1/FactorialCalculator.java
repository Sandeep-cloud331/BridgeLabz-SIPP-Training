import java.util.Scanner;

/*
 * Compute the factorial of input number
 */
 
public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer to find its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
			
            int factorial = 1;

            // Use a for loop to calculate factorial from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the resulting factorial
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
