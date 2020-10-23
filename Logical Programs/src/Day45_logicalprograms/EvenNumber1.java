package Day45_logicalprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber1 {
    public static void main(String[] args) {
        List<String> numberList = Arrays.asList("3", "4", "21", "18", "24", "19", "30", "42");

        List<Integer> num = numberList.stream().map(i -> Integer.parseInt(i)).filter(n -> n % 2 == 0 && n < 20).collect(Collectors.toList());
        System.out.println(num);
    }
}
