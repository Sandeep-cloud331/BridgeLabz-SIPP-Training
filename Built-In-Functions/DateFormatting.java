import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        // getting date using Localdate.now()
        LocalDate currentDate = LocalDate.now();

        //initializing formatter for each type of format 
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // displaying the output date in diffrent formats
        System.out.println(currentDate.format(format1));
        System.out.println(currentDate.format(format2));
        System.out.println(currentDate.format(format3));
    }
}
