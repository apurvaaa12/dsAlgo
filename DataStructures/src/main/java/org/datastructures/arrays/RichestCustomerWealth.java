package org.datastructures.arrays;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args){
//        int[][] matrix = {{1,2,3},{3,2,1}};
        int[][] matrix = {{1,5},{7,3},{3,5}};
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        int richestCustomer = maximumWealth(matrix);
        System.out.println(richestCustomer);
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;

        int row = accounts.length;
        int column = accounts[0].length;
        int sum =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sum =sum+accounts[i][j];
            }
            System.out.println(sum);
            maxWealth = Math.max(maxWealth,sum);
            sum=0;
        }

        return maxWealth;
    }
}
