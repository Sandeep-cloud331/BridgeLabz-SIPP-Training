import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Enter a number between 1 and 99.");
            return;
        }

        int counter = number - 1;

        // Loop while counter > 1
        while (counter > 1) {
            if (number % counter == 0) {
                System.out.println("Factor: " + counter);
            }
            counter--;
        }
    }
}
