package Day17_logicalprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoopExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(13);
        al.add(7);
        al.add(36);
        al.add(89);
        al.add(97);


        /*For Loop Example for traversing ArrayList*/
        System.out.println("Using For Loop");
        for (int counter = 0; counter < al.size(); counter++) {
            System.out.println(al.get(counter));
        }

        /* Advanced For Loop Example for iterating ArrayList*/
        System.out.println("Using Advanced For Loop");
        for (Integer num : al) {
            System.out.println(num);
        }

        /* While Loop Example for iterating ArrayList*/
        System.out.println("Using While Loop");
        int count = 0;
        while (al.size() > count) {
            System.out.println(al.get(count));
            count++;
        }

        /* Iterator Example for Traversing ArrayList */
        System.out.println("Using Iterator");
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        /* Collection stream() util example */
        System.out.println("Using Collection stream() util");
        al.forEach((num) -> {
            System.out.println(num);
        });

    }

}
