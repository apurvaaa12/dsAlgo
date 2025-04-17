package org.datastructures.dynamicProgramming;

import org.apache.logging.log4j.core.config.plugins.processor.PluginEntry;

//lcs + in else set it to 0 find max len
public class LongestCommonSubString {
    public static void main(String[] args) {
        String one = "abcdef";
        String two = "abfce";
        int firstLength = one.length();
        int secondLength = two.length();
        int[][] dpArray = new int[firstLength + 1][secondLength + 1];
        int longestSubString = longestSubString(one, two, firstLength, secondLength, dpArray);
        System.out.println(longestSubString);
    }

    private static int longestSubString(String one, String two, int firstLength, int secondLength, int[][] dpArray) {
        int maxLen = 0;
        for (int i = 0; i <= firstLength; i++) {
            for (int j = 0; j <= secondLength; j++) {
                if (i == 0 || j == 0) {
                    dpArray[i][j] = 0;
                } else if (one.charAt(i - 1) == two.charAt(j - 1)) {
                    dpArray[i][j] = 1 + dpArray[i - 1][j - 1];
                    maxLen = Math.max(maxLen, dpArray[i][j]);
                } else if (one.charAt(i - 1) != two.charAt(j - 1)) {
                    dpArray[i][j] = 0;
                }
            }
        }

        return maxLen;
    }
}
