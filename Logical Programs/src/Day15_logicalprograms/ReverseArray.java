package Day15_logicalprograms;

public class ReverseArray {
    static void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int ar[] = {12, 34, 54, 32, 45, 6, 17};

        System.out.println("before reversing");
        display(ar);

        //array reversing algorithm
        for (int i = 0; i < ar.length / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = temp;
        }
        System.out.println("after reversing");
        display(ar);
    }
}
