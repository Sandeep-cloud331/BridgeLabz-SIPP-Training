import java.util.Scanner;

/*
 * Takes height in cm as input
 * Calculates height in feet and inches
 */

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// User height input in cm
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
		
		// Convert height to feet and inches
        double inches = heightCm / 2.54;
        int feet = (int)(inches / 12);
        double remainingInches = inches % 12;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + remainingInches);
    }
}