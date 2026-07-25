package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    // Given a list of numbers, return only the unique values.
    public static Set<Integer> uniqueElements(int[] values) {
        Set<Integer> unique = new HashSet<>();
        for (int val : values) {
            unique.add(val);
        }
        return unique;
    }
}