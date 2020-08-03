package Day8_logicalprograms;

import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

import java.time.LocalDateTime;
import java.time.Month;

import static java.util.Calendar.MAY;

public class print_CertainDateTime {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(1992, MAY , 10, 12, 43, 1);
        System.out.println(dateTime);
        System.out.println("After 10 months: " + dateTime.plusMonths(10));
        System.out.println("before 10 months: " + dateTime.minusMonths(10));
    }
}
