package Day8_logicalprograms;

import java.time.LocalTime;

public class Print_TimeInOwnFormat {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nsec = time.getNano();

        System.out.println("Printing time in our own format: " + nsec + ":" + sec + ":" + min + ":" + hour);
    }
}
