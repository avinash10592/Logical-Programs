package Day6_logicalprograms;

import java.util.HashMap;

public class HashMapSizeExample {
    public static void main(String[] args) {
        // Creating a HashMap of int keys and String values
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        // Adding Key and Value pairs to HashMap
        hashmap.put(11, "Apple");
        hashmap.put(22, "Banana");
        hashmap.put(33, "Mango");
        hashmap.put(44, "Pear");
        hashmap.put(55, "PineApple");

        // int size() method returns the number of key value pairs
        System.out.println("Size of HashMap : " + hashmap.size());
    }
}

