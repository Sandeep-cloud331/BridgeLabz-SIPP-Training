import java.util.Scanner;

public class RemainderQuotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get two numbers from the user
        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();
        System.err.print("Enter number 2: ");
        int number2 = input.nextInt();

        // method calling and storing the return in the result array
        int[] result = findRemainderAndQuotient(number1, number2);
        System.out.println("Remainder = " + result[0] +
                "\nQuotient = " + result[1]);

        input.close();
    }

    // method declaration to find remainder and quotientof thwo numbe
    public static int[] findRemainderAndQuotient(int number1, int number2) {
        int remainder = number1 % number2;
        int quotient = number1 / number2;

        return new int[] { remainder, quotient };
    }
}