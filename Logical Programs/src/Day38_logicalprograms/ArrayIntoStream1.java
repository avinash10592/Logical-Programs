package Day38_logicalprograms;

import java.util.Arrays;

public class ArrayIntoStream1 {
    public static void main(String[] args) {
        int arr[] = {99, 55, 203, 99, 4, 91};
        Arrays.parallelSort(arr);
        // Sorted the Array using parallelSort()

        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
        /* Converted it into Stream and then
           printed using forEach */
    }
}
