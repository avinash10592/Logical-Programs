package Day31_logicalprograms;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Assignment6 {

    public static void main(String[] args) {

        int myArray[] = {45, 35, 95, 65, 15, 25, 5, 85};
        Arrays.sort(myArray);
        for (int i : myArray) {
            System.out.println(i);
        }

        //Arrays.stream
        IntStream stream1 = Arrays.stream(myArray);
        //stream1.forEach(num -> System.out.println(num));

        OptionalInt firstElement = stream1.filter(num -> num < 5).findFirst();
        System.out.println(firstElement);


    }
}