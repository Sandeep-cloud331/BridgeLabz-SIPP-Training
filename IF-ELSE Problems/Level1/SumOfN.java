import java.util.Scanner;

/*
 * Takes user input for Num
 * Provide sum of Num Numbers
 */
 
public class SumOfN{
	public static void main(String[] args){
		
		// Create a scanner object to take input from keyboard
		Scanner input = new Scanner(System.in);
		
		// Promt user to enter a number 
		System.out.print("enter a number: ");
		int num = input.nextInt();
		
		// For loop to get totalsum
		int totalSum=0;
		for(int i=1;i<=num;i++){
			totalSum += i;
		}
		
		System.out.println("The sum of num is: "+ totalSum);
		
	}
}