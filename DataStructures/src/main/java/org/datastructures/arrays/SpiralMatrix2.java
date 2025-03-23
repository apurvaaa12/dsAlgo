package org.datastructures.arrays;

import java.util.Arrays;


public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] spiralOrderMatrix = generateMatrix(n);
        for (int i = 0; i < spiralOrderMatrix.length; i++) {
            System.out.println(Arrays.toString(spiralOrderMatrix[i]));
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] output = new int[n][n];

        int count = 1;
        int rowBegin = 0;
        int rowEnd = output.length - 1;

        int columnBegin = 0;
        int columnEnd = output[0].length - 1;

        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            for (int i = columnBegin; i <= columnEnd; i++) {
                output[rowBegin][i] = count++;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                output[i][columnEnd] = count++;
            }
            columnEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    output[rowEnd][i] = count++;
                }
            }

            rowEnd--;

            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    output[i][columnBegin] = count++;
                }
            }

            columnBegin++;

        }
        return output;
    }
}
