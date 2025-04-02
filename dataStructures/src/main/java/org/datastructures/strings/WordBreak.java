package org.datastructures.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args){
        String string = "catsandog";
        List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
        boolean answer = wordBreak(string,wordDict);
        System.out.println(answer);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        // Convert the list to a HashSet for faster O(1) lookups
        Set<String> wordSet = new HashSet<>(wordDict);

        int length = s.length(); // Get the length of the input string
        boolean[] dp = new boolean[length + 1];
        dp[0] = true; // Base case: an empty string can always be segmented
        // Iterate through the string to fill the dp array
        for(int i=0;i<=length;i++){
            // Check all possible partitions of the substring s[0:i]
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    System.out.println("wordSet " +s.substring(j, i));
                    dp[i] = true; // Mark s[0:i] as segmentable
                    break; // No need to check further partitions, exit loop
                }
            }
        }
        return dp[length];
    }
}
