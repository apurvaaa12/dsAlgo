package org.datastructures.arrays;

import java.util.Arrays;

//https://www.naukri.com/code360/problems/matrix-is-symmetric_799361?utm_source=youtube&utm_medium=affiliate&utm_campaign=parikh_youtube
// the matrix is symmetric if it's transpose is the same as the current matrix.
public class SymmetricMatrix {
    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{1, 2}, {2,1}};
        System.out.println("Initial Matrix");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        boolean isSymmetric = isMatrixSymmetric(matrix);
        System.out.println("The given matrix is: " + isSymmetric);
    }

    public static boolean isMatrixSymmetric(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        //a matrix is symmetric only if it's a square
        if(row !=  column){
            return false;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }

        return true;
    }

}
