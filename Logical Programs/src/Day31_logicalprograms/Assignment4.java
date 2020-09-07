package Day31_logicalprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Assignment4 {

    public static void main(String[] args) {


        List<Integer> numberList = Arrays.asList(2, 4, 6, 8, 10, 15, 20, 40, 60, 90);

        Double newList = numberList.stream()
                .map(num -> num * num)
                .filter(num -> num < 100)
                .collect(Collectors.averagingDouble(num -> new Double(num)));

        System.out.println("Average of the list: " + newList);
    }

}