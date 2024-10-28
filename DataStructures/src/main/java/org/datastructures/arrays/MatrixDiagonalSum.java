package org.datastructures.arrays;

import java.util.Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        int sum = diagonalSum(matrix);
        System.out.println(sum);
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int row = mat.length;
        for (int i = 0; i < row; i++) {
            sum = sum + mat[i][i]; //sum of primary diagonal
            if (i != (row - 1 - i)) {
                sum = sum + mat[i][row - 1 - i]; //sum of secondary diagonal
            }
        }


        return sum;

    }
}
