import java.util.Scanner;

/*
 * Takes fee and discountPercent as input
 * Calculates discount and discountedFee
 */

public class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter fee amount: ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

		//calculates discount and discountedFee
        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}