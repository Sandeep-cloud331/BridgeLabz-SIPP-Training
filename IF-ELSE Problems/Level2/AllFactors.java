import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Loop from 1 to number - 1
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Factor: " + i);
            }
        }
    }
}
