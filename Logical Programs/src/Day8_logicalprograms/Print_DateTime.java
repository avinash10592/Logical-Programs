package Day8_logicalprograms;

import java.time.LocalDateTime;

public class Print_DateTime {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();

        int day = datetime.getDayOfMonth();
        int month = datetime.getMonthValue();
        int year = datetime.getYear();
        System.out.println("Date: " + month + "-" + day + "-" + year);

        int hours = datetime.getHour();
        int min = datetime.getMinute();
        int sec = datetime.getSecond();
        int nsec = datetime.getNano();
        System.out.println("Time: " + hours + ":" + min + ":" + sec + ":" + nsec);
    }
}