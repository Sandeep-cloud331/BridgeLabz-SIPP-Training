import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeInDiffrentZones {
    public static void main(String[] args) {
        // defining formatter for display result
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        //for IST
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(istTime.format(formatter));

        // for GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println(gmtTime.format(formatter));

        // for PST
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(pstTime.format(formatter));

    }
}