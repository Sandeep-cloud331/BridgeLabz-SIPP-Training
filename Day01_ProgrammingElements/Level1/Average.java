import java.util.Scanner;

/**
 * This program calculates the average marks of a student in PCM subjects.
 */
public class Average{
	public static void main(String[] args){
		// Each subject marks
		int maths = 94,physics = 92,chemistry = 91; 
		
		// Average marks calculation    
		double averageMarks = (double)(physics + chemistry + maths)/3;
		
		// Display the average
		System.out.println("Sam’s average mark in PCM is "+ averageMarks);   
	}
}