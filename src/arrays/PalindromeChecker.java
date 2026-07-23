package arrays;

public class PalindromeChecker {
    //Given a string, determine whether it reads the same forward and backward.
    //Brute Force
    public static boolean checkPalindromeBrute(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed.equals(s);
    }
    
    public static boolean checkPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}