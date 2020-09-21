package Day37_logicalprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateTwoStreams1 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Hello", "this");
        List<String> list2 = Arrays.asList("is", "Avinash", ",", "How", "are", "you");

        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());

        // Concatenated the list1 and list2 by converting them into Stream

        concatStream.forEach(str -> System.out.print(str + " "));

        // Printed the Concatenated Stream

    }
}
