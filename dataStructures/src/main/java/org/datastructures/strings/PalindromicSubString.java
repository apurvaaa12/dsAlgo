package org.datastructures.strings;

public class PalindromicSubString {
    public static void main(String[] args) {
        String input = "abc";
        int output = countSubstrings(input);
        System.out.println(output);
    }

    public static int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = ans + check(s, i, i);
            ans = ans + check(s, i, i + 1);
        }
        return ans;
    }

    public static int check(String s, int start, int end) {
        int ans = 0;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            ans++;
            start--;
            end++;
        }
        return ans;
    }
}
