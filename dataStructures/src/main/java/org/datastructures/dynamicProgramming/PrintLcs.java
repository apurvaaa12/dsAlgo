package org.datastructures.dynamicProgramming;

public class PrintLcs {
    public static void main(String[] args) {
        String one = "ezupkr";
        String two = "ubmrapg";
        int firstLength = one.length();
        int secondLength = two.length();
        int[][] dpArray = new int[firstLength+1][secondLength+1];

        String output = printLongest(one, two, firstLength, secondLength,dpArray);
        System.out.println(output);
    }

    public static String printLongest(String one,String two, int firstLength, int secondLength, int[][] dpArray){
        StringBuilder stringBuilder = new StringBuilder();

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

        int i = firstLength, j = secondLength;

        while (i > 0 && j > 0) {
            if (one.charAt(i - 1) == two.charAt(j - 1)) {
                stringBuilder.append(one.charAt(i - 1));
                i--;
                j--;
            } else {
                if (dpArray[i][j - 1] > dpArray[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

        return stringBuilder.reverse().toString();
    }
}
