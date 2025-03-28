package org.datastructures.random;

import java.util.Arrays;

public class GoodPeopleBadPeople {
    public static void main(String[] args){
        int[][] statements = {{2,1,2},{1,2,2},{2,0,2}};
        int maxGood = maximumGood(statements);
        System.out.println(maxGood);
    }

    public static int maximumGood(int[][] statements) {
        int maxGood =0;
        for(int i=0;i< statements.length;i++){
            for(int j=0;j<statements[i].length;j++){
               if(statements[i][j]==1){
                   maxGood++;
               }
            }
        }
        return maxGood;
    }
}
