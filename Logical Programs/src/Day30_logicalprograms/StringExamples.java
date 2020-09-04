package Day30_logicalprograms;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = "JAVA";

        String s2 = "JAVA";

        //Output : true
        System.out.println(s1 == s2);

        s1 = s1 + "J2EE";

        //Output : false
        System.out.println(s1 == s2);
    }
}
