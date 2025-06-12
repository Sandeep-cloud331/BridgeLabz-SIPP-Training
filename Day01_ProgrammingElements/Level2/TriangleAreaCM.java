import java.util.Scanner;
public class TriangleAreaCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter base and height in cm
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Calculate area in square centimeters
        double areaInSqCm = 0.5 * baseCm * heightCm;

        // Convert area to square inches 
        double areaInSqInches = areaInSqCm / 6.4516;

        // Display results
        System.out.println("The Area of the triangle in sq in is " + areaInSqInches + " and sq cm is " + areaInSqCm);
    }
}