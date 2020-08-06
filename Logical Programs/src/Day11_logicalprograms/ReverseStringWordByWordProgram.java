package Day11_logicalprograms;

import java.util.Scanner;

public class ReverseStringWordByWordProgram {
    public static String reverseTheSentence(String inputString) {
        String[] words = inputString.split("\n");

        String outputString = "";

        for (int i = words.length - 1; i >= 0; i--) {
            outputString = outputString + words[i] + " ";
        }

        return outputString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Input String :");

        String inputString = sc.nextLine();

        String outputString = reverseTheSentence(inputString);

        System.out.println("Input String : " + inputString);

        System.out.println("Output String : " + outputString);

        sc.close();
    }
}