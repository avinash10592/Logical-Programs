package Day12_logicalprograms;

import java.util.Scanner;

public class RemoveAllVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string...");

        String inputString = sc.nextLine();

        String newInputString = inputString.replaceAll("[AEIOUaeiou]", "");

        System.out.println("The string without vowels...");

        System.out.println(newInputString);

        sc.close();
    }
}
