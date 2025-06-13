import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        // Create Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt and take input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
