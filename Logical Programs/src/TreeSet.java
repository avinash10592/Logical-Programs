import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String args[]) {
        TreeSet<Integer> set1 = new TreeSet<Integer>();
        set1.add(24);
        set1.add(66);
        set1.add(12);
        set1.add(55);
        set1.add(43);
        set1.add(15);
        TreeSet<Integer> set2 = new TreeSet<Integer>();
        set2.add(23);
        set2.add(57);
        set2.add(99);
        set2.add(121);
        set2.add(124);
        set2.add(224);
        set1.addAll(set2);
        System.out.println("poolFirst number from the set:  " + set1.pollFirst());
        System.out.println("poolLast number from the set:  " + set1.pollLast());
        System.out.println("headSet from the number 57 :  " + set1.headSet(57));
        System.out.println("tailSet from the number 99:  " + set1.tailSet(99));
        System.out.println("subSet fro the numbers 43&99:  " + set1.subSet(43, 99));
        System.out.println("first number from the set:  " + set1.first());
        System.out.println("last number from the set:  " + set1.last());
        Iterator obj = set1.iterator();
        while (obj.hasNext()) {
            System.out.println(obj.next());
        }

    }
}
