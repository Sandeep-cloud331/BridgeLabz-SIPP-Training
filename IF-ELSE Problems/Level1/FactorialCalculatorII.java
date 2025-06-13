import java.util.Scanner;

/*
 * Compute the factorial of input number
 * Use of while loop to compute the factorial
 */
 
public class FactorialCalculatorII {
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
			int i = 1;

            // Use a while loop to calculate factorial from 1 to the entered number
            while (i <= number) {
                factorial *= i++;
				
            }

            // Print the resulting factorial
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
