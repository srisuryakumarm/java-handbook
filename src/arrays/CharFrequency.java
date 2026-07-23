package arrays;

public class CharFrequency {
    // Given a lowercase string, count how many times each character appears.
    public static int[] countCharFreq(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        return count;
    }
}