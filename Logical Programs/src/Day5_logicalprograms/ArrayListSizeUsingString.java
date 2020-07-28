package Day5_logicalprograms;

import java.util.ArrayList;

public class ArrayListSizeUsingString {
    public static void main(String[] args) {
        System.out.println("Java Program to find the size of ArrayList");

        // Create an String ArrayList Object
        ArrayList<String> listOfCities = new ArrayList<>();

        int size = listOfCities.size();
        // Print initial size of ArrayList
        System.out.println("size of ArrayList after creation: " + size);

        // Adding elements to ArrayList Object
        listOfCities.add("California");
        listOfCities.add("Boston");
        listOfCities.add("New York");

        size = listOfCities.size();
       /* Print size of ArrayList
          after adding elements */
        System.out.println("size of ArrayList after adding elements: " + size);

        // clear() method removes all elements
        listOfCities.clear();

        size = listOfCities.size();
        System.out.println("size of ArrayList after clearing elements: " + size);
    }
}
