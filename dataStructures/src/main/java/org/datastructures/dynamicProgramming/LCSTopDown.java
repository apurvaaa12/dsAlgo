package org.datastructures.dynamicProgramming;

import java.util.Arrays;

public class LCSTopDown {
    public static void main(String[] args) {
        String one = "ezupkr";
        String two = "ubmrapg";
        int firstLength = one.length();
        int secondLength = two.length();
        int[][] dpArray = new int[firstLength+1][secondLength+1];


        int length = longestCommonSubsequence(one, two, firstLength, secondLength,dpArray);
        System.out.println(length);
    }
    public static int longestCommonSubsequence(String one, String two, int firstLength, int secondLength,int[][]dpArray) {
        //i==firstlength j == secondLength
        for(int i=0;i<=firstLength;i++){
            for(int j=0;j<=secondLength;j++){
                if(i==0 || j==0){
                    dpArray[i][j] =0;
                }else if(one.charAt(i-1) == two.charAt(j-1)){
                    dpArray[i][j] = 1 + dpArray[i-1][j-1];
                }else if(one.charAt(i-1) != two.charAt(j-1)){
                    dpArray[i][j] = Math.max(dpArray[i][j-1],dpArray[i-1][j]);
                }
            }
        }

        return dpArray[firstLength][secondLength];
    }
}
