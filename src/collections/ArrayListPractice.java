package collections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static int findMaximum(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List must not be null or empty");
        }
        int max = list.get(0);
        for (int a : list) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static void reverseArray(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}