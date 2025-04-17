package org.datastructures.dynamicProgramming;


//i!= j condition is added
public class LongestRepeatingSubSeq {
    public static void main(String[] args) {
        String one = "aabcaabdaab";
        String two = "aabcaabdaab";
        int firstLength = one.length();
        int secondLength = two.length();
        var dpArray = new int[firstLength + 1][secondLength + 1];
        int longestSubSeq = longestRepeatingSubsequence(one, two, firstLength, secondLength, dpArray);
        System.out.println(longestSubSeq);

    }

    public static int longestRepeatingSubsequence(String one, String two, int firstLength, int secondLength, int[][] dpArray) {

        for (int i = 0; i <= firstLength; i++) {
            for (int j = 0; j <= secondLength; j++) {
                if (i == 0 || j == 0) {
                    dpArray[i][j] = 0;
                } else if (one.charAt(i - 1) == two.charAt(j - 1) && i != j) {
                    dpArray[i][j] = 1 + dpArray[i - 1][j - 1];
                } else {
                    dpArray[i][j] = Math.max(dpArray[i - 1][j], dpArray[i][j - 1]);
                }
            }
        }

        return dpArray[firstLength][secondLength];
    }
}
