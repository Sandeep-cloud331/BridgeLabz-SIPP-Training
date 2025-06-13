import java.util.Scanner;

public class IsFirstNumSmallest {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();

        // Check if the first number is smaller than both second and third
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Print the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Close the scanner
        scanner.close();
    }
}
