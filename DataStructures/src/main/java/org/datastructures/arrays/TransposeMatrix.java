package org.datastructures.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/description/
public class TransposeMatrix {

    public static void main(String[] args){
//       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3},{4,5,6}};
        for(int i =0; i< matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
       int[][] transposeMatrix = transpose(matrix);

       for(int i =0; i< transposeMatrix.length;i++){
           System.out.println(Arrays.toString(transposeMatrix[i]));
       }


    }
    public static int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int column = matrix[0].length;

        int[][] transposeMatrix = new int[column][row];
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[0].length; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
            System.out.println(Arrays.toString(transposeMatrix[i]));
            System.out.println("-------------");
        }
        System.out.println("-------------");

        return transposeMatrix;
    }
}
