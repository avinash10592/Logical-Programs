package Day39_logicalprograms;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample1 {
    public static void main(String args[]) {

        // Declare TreeMap
        TreeMap<Integer, String> treemap =
                new TreeMap<Integer, String>();

        //Adding elements to TreeMap
        treemap.put(1, "Value1");
        treemap.put(44, "Value2");
        treemap.put(22, "Value3");
        treemap.put(5, "Value4");
        treemap.put(2, "Value5");

        // Display elements using Iterator
        Set set = treemap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.print("key is: " + pair.getKey() + " and value is: ");
            System.out.println(pair.getValue());
        }
    }
}
