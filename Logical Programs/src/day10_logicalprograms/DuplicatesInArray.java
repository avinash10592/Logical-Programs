package day10_logicalprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class DuplicatesInArray {

    // Using Java 8 Streams
    private static <Set> void findDuplicatesUsingJava8(int[] inputArray) {
        Set uniqueElements = (Set) new HashSet();
        Set duplicateElements = (Set) Arrays.stream(inputArray)
                .filter(i -> !((HashSet) uniqueElements).add(i))
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(duplicateElements);
    }

    private static void findDuplicatesUsingBruteForce(int[] inputArray) {
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{111, 333, 555, 777, 333, 444, 555};
        System.out.println("======Duplicates Using Brute Force======");
        findDuplicatesUsingBruteForce(inputArray);

        findDuplicatesUsingJava8(inputArray);
    }


}
