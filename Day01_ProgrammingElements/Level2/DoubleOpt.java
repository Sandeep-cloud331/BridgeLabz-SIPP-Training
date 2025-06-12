import java.util.*;
public class DoubleOpt {
    public static void main(String[] args) {
		// Creates Scanner object to take input from keyboard 
        Scanner sc = new Scanner(System.in);
		
		// Promt user to input a,b,c
        System.out.print("Enter double a: ");
        double a = sc.nextDouble();
        System.out.print("Enter double b: ");
        double b = sc.nextDouble();
        System.out.print("Enter double c: ");
        double c = sc.nextDouble();

        // Operator precedence as in integer values
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("The results of Double Operations are: " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
    }
}
