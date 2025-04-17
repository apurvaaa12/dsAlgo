package org.datastructures.dynamicProgramming;


//discont
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String one = "ezupkr";
        String two = "ubmrapg";
        int firstLength = one.length();
        int secondLength = two.length();
        int length = longestCommonSubsequence(one, two, firstLength, secondLength);
        System.out.println(length);
    }

    public static int longestCommonSubsequence(String one, String two, int firstLength, int secondLength) {
        if (firstLength == 0 || secondLength == 0) return 0;

        if(one.charAt(firstLength-1)==two.charAt(secondLength-1)){
            return 1+ longestCommonSubsequence(one,two,firstLength-1,secondLength-1);
        }
        else if(one.charAt(firstLength-1) != two.charAt(secondLength-1)){
            return Math.max(longestCommonSubsequence(one,two,firstLength-1,secondLength),
                    longestCommonSubsequence(one,two,firstLength,secondLength-1));
        }

        return longestCommonSubsequence(one,two,firstLength,secondLength);
    }
}
