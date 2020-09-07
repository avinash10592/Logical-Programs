package Day31_logicalprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Assignment5 {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(20, 15, 40, 2, 4, 6, 60, 90, 8, 10);


        Optional<Integer> newList = numberList.stream()
                .sorted()
                .findFirst();
        System.out.println("Lowest number in the list: " + newList);

        Optional<Integer> newList1 = numberList.stream()
                .sorted((num1, num2) -> (num1 < num2) ? 1 : (num1 > num2) ? -1 : 0)
                .findFirst();
        System.out.println("Highest number in the list: " + newList1);

    }
}