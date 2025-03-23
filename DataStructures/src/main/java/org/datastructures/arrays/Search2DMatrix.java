package org.datastructures.arrays;

import java.util.Arrays;

public class Search2DMatrix {
    public static void main(String[] args){
        int[][] matrix ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target= 100;
        for(int i=0;i< matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
