package Day40_logicalprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.add(10);
        myList.add(4);
        myList.add(8);
        myList.add(7);
        myList.add(3);

        String str1 = myList.stream().distinct() // removing duplicates from the list
                .filter(num -> num % 2 == 0)// filtering only even numbers
                .map(Objects::toString) //converting it toString
                .collect(Collectors.joining()); //collecting it by joining it


        System.out.println("String converted from a list :" + str1);

        // reversing the string builder and converting it to String
        StringBuilder sb = new StringBuilder(str1);
        String str2 = sb.reverse().toString();

        // comparing the two strings and checking if it is palindrome or not

        if (str1.equalsIgnoreCase(str2) == true) {

            System.out.println(str1 + " and " + str2 + " strings are Palindrome");
        } else {
            System.out.println(str1 + " and " + str2 + " string are not Palindrome");
        }
    }
}
