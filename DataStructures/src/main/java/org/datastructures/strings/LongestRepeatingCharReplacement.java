package org.datastructures.strings;

import java.util.HashMap;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int charReplacement = characterReplacement(s, k);
        System.out.println(charReplacement);
    }

    public static int characterReplacement(String s, int k) {
        int left = 0, maxLength = 0, maxFrequency = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            map.put(current, map.getOrDefault(current, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(current));


            // If the number of replacements needed exceeds k, shrink the window from the left
            while ((right - left + 1) - maxFrequency > k) {
                char leftChar = s.charAt(left);
                // Reduce the count of the character that is being removed from the window
                map.put(leftChar, map.get(leftChar) - 1);
                // Move the left pointer forward to shrink the window
                left++;
            }

            // Update the maximum length of a valid window found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }
}
