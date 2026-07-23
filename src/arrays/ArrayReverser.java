package arrays;

public class ArrayReverser {
    //Reverse the order of elements in an array, without allocating a second array proportional to the input size.
    
    // Brute Force
    public static int[] reverseArray(int[] arr) {
        int[] reverse = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[i] = arr[i];
        }
        return reverse;
    }

    //Inplace
    public static void reverseArrayInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}