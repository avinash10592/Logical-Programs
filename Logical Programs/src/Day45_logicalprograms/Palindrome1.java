package Day45_logicalprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 4.Given a list contains  strings. find the the string which are in palindrome
 * <p>
 * List<String> numberList={"hello","aoa","mkitty","uber"}
 */
public class Palindrome1 {
    public static void main(String[] args) {


        //Given list
        List<String> strList = Arrays.asList("hello", "bob", "Owl", "mkitty", "uber", "mom");

        List<String> stringsWhichArePalindrome =
                strList.stream()
                        .filter(str -> isPalindrome(str))
                        .collect(Collectors.toList());

        System.out.println("Palindrome Strings in a list are: " + stringsWhichArePalindrome);


    }

    //method which returns the Palindrome Strings
    static boolean isPalindrome(String str) {
        int len = str.length();
        // compare each character from starting
        // with its corresponding character from last
        for (int i = 0; i < len / 2; i++)
            if (str.charAt(i) != str.charAt(len - i - 1))
                return false;
        return true;
    }
}
