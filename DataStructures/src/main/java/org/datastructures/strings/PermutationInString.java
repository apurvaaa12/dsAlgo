package org.datastructures.strings;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args){
        String str1 = "abc", str2 = "bbbca";
        System.out.println(checkInclusion(str1,str2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // If s2 is smaller than s1, no permutation is possible
        if (n < m) {
            return false;
        }

        int[] firstStringFrequency = new int[26]; // Frequency array for s1
        int[] secondStringFrequency = new int[26]; // Frequency array for the current window in s2

        // Populate frequency array for s1
        for (int i = 0; i < m; i++) {
            firstStringFrequency[s1.charAt(i) - 'a']++;
            secondStringFrequency[s2.charAt(i) - 'a']++; // Initialize the first window of s2
        }

        // Compare the first window
        if (Arrays.equals(firstStringFrequency, secondStringFrequency)) {
            return true;
        }

        // Sliding window: Slide over s2 from index m to n
        for (int i = m; i < n; i++) {
            // Add new character in window
            secondStringFrequency[s2.charAt(i) - 'a']++;
            // Remove the old character from the previous window
            secondStringFrequency[s2.charAt(i - m) - 'a']--;

            // Check if the current window matches s1's frequency
            if (Arrays.equals(firstStringFrequency, secondStringFrequency)) {
                return true;
            }
        }

        // If no match found, return false
        return false;
    }

}



//check if any substring of s2 is an anagram of s1 in s2
//Sliding window technique

