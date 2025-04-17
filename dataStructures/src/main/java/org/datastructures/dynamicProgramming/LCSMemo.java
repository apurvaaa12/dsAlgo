package org.datastructures.dynamicProgramming;

import java.util.Arrays;

public class LCSMemo {
    public static void main(String[] args) {
        String one = "ezupkr";
        String two = "ubmrapg";
        int firstLength = one.length();
        int secondLength = two.length();
        int[][] dpArray = new int[firstLength+1][secondLength+1];

        for (int i = 0; i <= firstLength; i++) {
            Arrays.fill(dpArray[i], -1);
        }

        int length = longestCommonSubsequence(one, two, firstLength, secondLength,dpArray);
        System.out.println(length);
    }
    public static int longestCommonSubsequence(String one, String two, int firstLength, int secondLength,int[][]dpArray) {

        if (firstLength == 0 || secondLength == 0) {
            return 0;
        }


        if(dpArray[firstLength][secondLength] != -1){
            return dpArray[firstLength][secondLength];
        }

        if(one.charAt(firstLength-1) == two.charAt(secondLength-1)){
            dpArray[firstLength][secondLength] = 1+ longestCommonSubsequence(one,two,firstLength-1,secondLength-1,dpArray);
        }else if(one.charAt(firstLength-1) != two.charAt(secondLength-1)){
            dpArray[firstLength][secondLength] = Math.max(longestCommonSubsequence(one,two,firstLength-1,secondLength,dpArray),
                    longestCommonSubsequence(one,two,firstLength,secondLength-1,dpArray));
        }

        return dpArray[firstLength][secondLength];
    }
}
