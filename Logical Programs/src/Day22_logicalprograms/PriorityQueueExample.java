package Day22_logicalprograms;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        //Creating a PriorityQueue with default Comparator.

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        //Inserting elements into pQueue.

        pQueue.offer(21);

        pQueue.offer(17);

        pQueue.offer(37);

        pQueue.offer(41);

        pQueue.offer(9);

        pQueue.offer(67);

        pQueue.offer(31);

        //Removing the head elements

        System.out.println(pQueue.poll());

        System.out.println(pQueue.poll());
        
        System.out.println(pQueue.poll());

        System.out.println(pQueue.poll());

        System.out.println(pQueue.poll());

        System.out.println(pQueue.poll());

        System.out.println(pQueue.poll());
    }
}
