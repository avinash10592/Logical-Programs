package Day37_logicalprograms;

import java.util.ArrayList;
import java.util.List;

public class FindingLength1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Avinash");
        list.add("Riyaz");
        list.add("Rohit");
        list.add("Srinivas");

        // Added elements into the List

        long count = list.stream().filter(str -> str.length() > 5).count();

        /* Converted the list into Stream and filtering out
           the Strings whose length more than 5
           and counted the length
           */
        System.out.println("We have " + count + " strings with length greater than 5");

    }
}
