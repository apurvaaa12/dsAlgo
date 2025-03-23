package org.datastructures.strings;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        String palindromicSubstring = longestPalindrome(s);
        System.out.println(palindromicSubstring);
    }

    // Variables to store the start and end indices of the longest palindrome found
    public static int start;
    public static int end;

    public static String longestPalindrome(String s) {
        start = 0;
        end = 0;

        // If the string has 0 or 1 character, return it as it's already a palindrome
        if (s.length() <= 1)
            return s;

        // Convert string to character array for easy access
        char[] charArray = s.toCharArray();

        // Start recursive palindrome search
        helper(charArray, 0);

        // Extract the longest palindromic substring using the updated indices
        return s.substring(start, end + 1);
    }

    private static void helper(char[] charArray, int i) {
        int length = charArray.length;

        // Base case: If the index is out of bounds, stop recursion
        if (i > length - 1) return;

        int left = i, right = i;

        // Expand right to account for even-length palindromes (e.g., "bb" in "abbc")
        while (right < length - 1 && charArray[right] == charArray[right + 1])
            right++;

        // Update index i to continue search from the rightmost matched character
        i = right;

        // Expand outwards while characters are equal (checking for palindromes)
        while (left > 0 && right < length - 1 && charArray[left - 1] == charArray[right + 1]) {
            left--;
            right++;
        }

        // Update start and end indices if we found a longer palindrome
        if (right - left > end - start) {
            start = left;
            end = right;
        }

        // Recursively check the next character
        helper(charArray, ++i);
    }
}