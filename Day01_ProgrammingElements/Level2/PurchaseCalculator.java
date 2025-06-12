import java.util.Scanner;

/*
 * Calculates the totalQuantity for unitPrice and quantity
 */
 
public class PurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Promt use for  input the unit price
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
		
		// Promt user for input the quantity		
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalQuantity = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}