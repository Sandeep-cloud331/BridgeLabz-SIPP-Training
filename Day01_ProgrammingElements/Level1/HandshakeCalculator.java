import java.util.Scanner;

/*
 * Calculates combination of handshakes
 */
public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
		
		// formula for calculating handshakes
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of possible handshakes is: " + handshakes);
    }
}