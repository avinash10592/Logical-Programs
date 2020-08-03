package Day8_logicalprograms;

import java.time.LocalDate;

public class Print_DateInOwnFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println("Printing date in our own format: " + month + "-" + day + "-" + year);

    }
}
