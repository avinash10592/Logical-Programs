package Day8_logicalprograms;

import java.time.LocalDate;
import java.time.LocalTime;

public class PrintToday_Date_Time {
    public static void main(String[] args) {

        // Printing today's date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // Printing today's time
        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}