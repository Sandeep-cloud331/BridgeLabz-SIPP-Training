import java.sql.SQLOutput;
import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		System.out.println("enter date(1-31)");
		int date =  input.nextInt();

		System.out.println("Enter month (1-12) :");
		int month = input.nextInt();

		if(month >=3 && month <=6 ){
			if(month ==3 && date <20 ){
				System.out.println("its not a spring season");
			}
			else if(month == 6 && date >20){
				System.out.println("its not a spring season");

			}
			else {
				System.out.println("its a spring season");
			}
		}
		else{
			System.out.println("its not a  spring season");
		}
		
		
	}
}
		