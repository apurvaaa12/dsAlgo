package org.datastructures.arrays;

import java.util.Arrays;

public class CountNegativeNumbers {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{3,2,1}};
        int[][] matrix = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1,-1,-2,-3}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        int numberOfNegatives = countNegatives(matrix);
        System.out.println(numberOfNegatives);
    }

    public static int countNegatives(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int count =0;
        for(int i=0;i< row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}
