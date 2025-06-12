import java.util.Scanner;

/*
 * Takes input as pemimeter 
 * Calculates the side of square 
 */

public class SquareSideFromPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter perimeter
        System.out.print("Enter perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side of square
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}