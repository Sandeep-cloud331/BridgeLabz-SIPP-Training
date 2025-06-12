import java.util.*;
public class IntOperation {
    public static void main(String[] args) {
		
		// Creates Scanner object to take input from keyboard
        Scanner sc = new Scanner(System.in);
		
		// Promt user to inout value of a,b,c
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        System.out.print("Enter integer c: ");
        int c = sc.nextInt();

        // Operator precedence is followed here
        int result1 = a + b * c; // b * c happens first, then add a
        int result2 = a * b + c; // a * b happens first, then add c
        int result3 = c + a / b; // a / b happens first, then add c
        int result4 = a % b + c; // a % b happens first, then add c
		
        System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
    }
}
