package org.datastructures.arrays;

import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        System.out.println("Initial Matrix");
        for(int i=0;i< matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        setZeroes(matrix);

        System.out.println("After setting Zeros");
        for(int i=0;i< matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        boolean firstRowIsZero = false;
        boolean firstColIsZero = false;

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) {
                firstColIsZero = true;
            }
        }
        for (int j = 0; j < column; j++) {
            if (matrix[0][j] == 0) {
                firstRowIsZero = true;
            }
        }

        //We're setting which elements are needed to set zeros
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //If we encounter an element that needs to be set to zero then we're setting it to zero
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstColIsZero) {
            for (int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
        if (firstRowIsZero) {
            for (int j = 0; j < column; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
