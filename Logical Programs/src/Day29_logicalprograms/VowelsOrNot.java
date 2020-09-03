package Day29_logicalprograms;
//Given a list contains  strings.Find the strings which are starting with vowels
//List<String> numberList={"hello","owl","mkitty","uber"}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class VowelsOrNot {
    public static void main(String[] args) {
        List<String> numberList = Arrays.asList("hello", "owl", "mkitty", "uber", "Elephant");

        List<String> str = numberList.stream()
                .filter(i -> i.toLowerCase().startsWith("a") || i.toLowerCase().startsWith("e") || i.toLowerCase().startsWith("i") || i.toLowerCase().startsWith("o") || i.toLowerCase().startsWith("u"))
                .collect(Collectors.toList());

        System.out.println(str);

    }
}
