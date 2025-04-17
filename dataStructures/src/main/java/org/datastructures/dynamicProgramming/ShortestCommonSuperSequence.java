package org.datastructures.dynamicProgramming;

public class ShortestCommonSuperSequence {
    public static void main(String[] args){
        String str1 ="abac";
        String str2 = "cab";
        int firstLength = str1.length();
        int secondLength = str2.length();
        int[][] dpArray = new int[firstLength+1][secondLength+1];
        int output = shortestCommonSupersequenceLength(str1,str2,firstLength,secondLength,dpArray);
        String outputString = shortestCommonSupersequence(str1,str2,firstLength,secondLength,dpArray);
        System.out.println(output);
        System.out.println(outputString);
    }

    //m+n-lcs
    public static int shortestCommonSupersequenceLength(String str1, String str2,int firstLength, int secondLength,int[][] dpArray) {
        for(int i=0;i<=firstLength;i++){
            for(int j=0;j<=secondLength;j++){
                if(i==0||j==0){
                    dpArray[i][j] =0;
                }else if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dpArray[i][j] = 1+ dpArray[i-1][j-1];
                }else if(str1.charAt(i-1) != str2.charAt(j-1)){
                    dpArray[i][j] = Math.max(dpArray[i-1][j],dpArray[i][j-1]);
                }
            }
        }

        return firstLength+secondLength-dpArray[firstLength][secondLength];
    }

    public static String shortestCommonSupersequence(String str1, String str2,int firstLength, int secondLength,int[][] dpArray) {
        for(int i=0;i<=firstLength;i++){
            for(int j=0;j<=secondLength;j++){
                if(i==0||j==0){
                    dpArray[i][j] =0;
                }else if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dpArray[i][j] = 1+ dpArray[i-1][j-1];
                }else if(str1.charAt(i-1) != str2.charAt(j-1)){
                    dpArray[i][j] = Math.max(dpArray[i-1][j],dpArray[i][j-1]);
                }
            }
        }

        int i= firstLength;
        int j= secondLength;
        StringBuilder stringBuilder = new StringBuilder();

        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                stringBuilder.append(str1.charAt(i-1));
                i--;
                j--;
            }else{
                if(dpArray[i][j-1] < dpArray[i-1][j]){
                    stringBuilder.append(str1.charAt(i-1));
                    i--;
                }else{
                    stringBuilder.append(str2.charAt(j-1));
                    j--;
                }
            }
        }

        while(i>0){
            stringBuilder.append(str1.charAt(i-1));
            i--;
        }

        while(j>0){
            stringBuilder.append(str2.charAt(j-1));
            j--;
        }

        return stringBuilder.reverse().toString();
    }
}
