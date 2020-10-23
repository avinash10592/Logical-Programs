package Day45_logicalprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleBy5 {
    public static void main(String[] args) {
        List<String> numberList = Arrays.asList("3", "4", "21", "18", "24", "19", "30", "42");

        List<Integer> num = numberList.stream()
                //Converting String to Map
                .map(s -> Integer.parseInt(s))
                .filter(i -> i % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(num);

    }
}
