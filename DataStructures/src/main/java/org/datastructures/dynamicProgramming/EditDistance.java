package org.datastructures.dynamicProgramming;

import java.util.Arrays;

//https://www.youtube.com/watch?v=YYo3PIclzjk
public class EditDistance {
    public static void main(String[] args){
        String word1 ="horse";
        String word2="ros";
        int minChanges = minDistance(word1,word2);
        System.out.println(minChanges);
    }

    public static int minDistance(String word1, String word2) {
        final int m = word1.length();//first word length
        final int n = word2.length();///second word length
        // dp[i][j] := min # of operations to convert word1[0..i) to word2[0..j)
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; ++i)
            dp[i][0] = i;

        for (int j = 1; j <= n; ++j)
            dp[0][j] = j;

        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(dp[i]));
        }

        for (int i = 1; i <= m; ++i)
            for (int j = 1; j <= n; ++j)
                if (word1.charAt(i - 1) == word2.charAt(j - 1))//same characters
                    dp[i][j] = dp[i - 1][j - 1];//no operation
                else
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;                      //replace               //delete        //insert

        return dp[m][n];
    }
}
