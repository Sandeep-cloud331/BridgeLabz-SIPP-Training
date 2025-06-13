import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a starting value for the countdown
        System.out.print("Enter the starting number for the countdown: ");
        int counter = scanner.nextInt();

        // Use a for loop to count down from the entered number to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        // Print final launch message
        System.out.println("Rocket Launched!");

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
