package org.datastructures.dynamicProgramming;

import java.util.Arrays;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "cbbd";
        String longestPalindrome = longestPalindrome(s);
        System.out.println(longestPalindrome);
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int oddLength = expandAroundCenter(s, i, i);
            int evenLength = expandAroundCenter(s, i, i + 1);
            int length = Math.max(oddLength, evenLength);

            if (length > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
