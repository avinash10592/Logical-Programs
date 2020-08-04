package Day9_logicalprograms;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class HashMapSortByKeyExample {
    public static void main(String args[]) {

        // Creating a HashMap of int keys and String values
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        // Adding Key and Value pairs to HashMap
        hashmap.put(22, "A");
        hashmap.put(55, "B");
        hashmap.put(33, "Z");
        hashmap.put(44, "M");
        hashmap.put(99, "I");
        hashmap.put(88, "X");

        System.out.println("Before Sorting:");
        // iterating the map
        hashmap.forEach((key, value) -> {
            System.out.println("Emp.Id: " + key + "," + "Employee Name: " + value);
        });
        System.out.println("After Sorting:");
        List<Integer> newList = hashmap.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println(newList);
    }
}

