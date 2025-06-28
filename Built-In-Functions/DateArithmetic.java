import java.time.*;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input from user
        String inputDate = sc.nextLine();
        // parse user input
        LocalDate date = LocalDate.parse(inputDate);
        // perform some operations on date
        LocalDate modified = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        // final output
        System.out.println(modified);
        sc.close();
    }
}