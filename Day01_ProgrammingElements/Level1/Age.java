import java.util.Scanner;

/**
 * This program calculates the age of user
 */
	
public class Age{
	public static void main(String[] args){
		int birthYear = 2000;  
		int currentYear = 2024; 
		
		// calculate and display age  
		int age = currentYear - birthYear;
		System.out.println("Harry's age in "+ currentYear+" is "+ age );  
	}
}