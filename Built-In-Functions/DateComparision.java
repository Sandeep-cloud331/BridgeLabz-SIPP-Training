import java.time.LocalDate;
import java.util.Scanner;

public class DateComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking two dates as input
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        LocalDate date1 = LocalDate.parse(input1);
        LocalDate date2 = LocalDate.parse(input2);

        //comparing between the entered two dates by user
        if(date1.isBefore(date2)){
            System.out.println("First Date is before the second date.");
        }
        else if(date1.isAfter(date2)){
            System.out.println("First date is after the second date.");
        }
        else if(date1.isEqual(date2)){
            System.out.println("First date is equal to second date");
        }
        sc.close();
    }
}
