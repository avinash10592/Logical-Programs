package Day5_logicalprograms;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //String 1 and String2 reverse both the Strings, combine string into single string, collect the  all caracters  from the index which are diviseble by 3, merg all the char and return the string
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String reverse1 = "";
        String reverse2 = "";
        String result="";

        for (int i = s1.length() - 1; i >= 0; i--) {
            reverse1 = reverse1 + s1.charAt(i);
        }
        for (int i = s2.length() - 1; i >= 0; i--) {
            reverse2 = reverse2 + s2.charAt(i);
        }
        String combined=reverse1+reverse2;
        for (int i=0;i<combined.length();i++)
        {
            if(i%3==0)
            {
                result=result + combined.charAt(i);
            }
        }
        System.out.println(reverse1);
        System.out.println(reverse2);
        System.out.println(combined);
        System.out.println(result);

    }
}
