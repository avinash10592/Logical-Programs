package Day40_logicalprograms;

import Day13_logicalprograms.Utility;

import java.util.Scanner;

public class Utility1 {
    static boolean numberOrNot(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}

class CheckMobileNumber {
    public static void main(String[] args) {
        System.out.println("Enter your mobile number");

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if (Utility1.numberOrNot(input) && (input.length() == 10)) {
            System.out.println("Good!!! You have entered valid mobile number");
        } else {
            System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
        }
    }
}
