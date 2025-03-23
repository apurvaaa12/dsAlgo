package org.datastructures.strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = lengthOfLongestSubstring(s);
        String longestString = longestString(s);
        System.out.println(maxLength);
        System.out.println(longestString);
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0, start = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            while (set.contains(current)) {
                set.remove(s.charAt(start++));
            }
            set.add(current);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static String longestString(String s) {
        int maxLength = 0, start = 0;
        int maxStart = 0, maxEnd = 0;
        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            if (set.contains(current)) {
                set.remove(s.charAt(start++));
            }
            set.add(current);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
                maxEnd = end;
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }
}