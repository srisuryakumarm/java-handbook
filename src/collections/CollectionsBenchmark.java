package collections;

import java.util.*;

public class CollectionsBenchmark{
    public static void main(String[] args){
        // ArrayList Front Insertion
        // Each insertion shift all exsisting elements making Time Complexity O(n)
        // making 100,000 insertion O(n²)
        List<Integer> list = new ArrayList<>();
        long startList = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            list.add(0, i);
        }
        long endList = System.nanoTime();
        long listDuration = endList - startList;

        // ArrayDeque Front Insertion
        // addFirst is amortised O(1), making 100,000 insertion O(n)
        // ArrayDeque uses circular array, avoids shifting the ArrayList required
        Deque<Integer> deque = new ArrayDeque<>();
        long startDeque = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            deque.addFirst(i);
        }
        long endDeque = System.nanoTime();
        long dequeDuration = endDeque - startDeque;

        // LinkedList Front Insertion
        // addFirst() is O(1), because linking a new node is simple
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startLinked = System.nanoTime();
        for(int i = 0; i < 100000; i++){
            linkedList.addFirst(i);
        }
        long endLinked = System.nanoTime();
        long linkedDuration = endLinked - startLinked;

        // Printing results converted into milliseconds
        System.out.println("ArrayList: " + listDuration / 100000 + " ms");
        System.out.println("ArrayDeque: " + dequeDuration / 100000 + " ms");
        System.out.println("LinkedList: " + linkedDuration / 100000 + " ms");
    }
}