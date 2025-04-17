package org.datastructures.dynamicProgramming;


//form the second string by getting the reverse of the first string.
public class LongestPalindromicSubSequence {
    public static void main(String[] args){
        String s = "cbbd";
        StringBuilder stringBuilder = new StringBuilder();
        String b = stringBuilder.append(s).reverse().toString();
        int firstLength = s.length();
        int secondLength = b.length();
        int[][] dpArray = new int[firstLength+1][secondLength+1];
        int longest = longestPalindromeSubseq(s,b,firstLength,secondLength,dpArray);
        System.out.println(longest);
    }

    public static int longestPalindromeSubseq(String s,String b, int firstLength, int secondLength,int[][] dpArray) {

        for(int i=0;i<=firstLength;i++){
            for(int j=0;j<=secondLength;j++){
                if(i==0 || j==0){
                    dpArray[i][j] = 0;
                }else if(s.charAt(i-1) == b.charAt(j-1)){
                    dpArray[i][j] = 1+ dpArray[i-1][j-1];
                }else if(s.charAt(i-1) != b.charAt(j-1)){
                    dpArray[i][j] = Math.max(dpArray[i-1][j],dpArray[i][j-1]);
                }
            }
        }
        return dpArray[firstLength][secondLength];
    }
}
