package org.datastructures.dynamicProgramming;

import java.util.Arrays;

public class knapsackTopDown {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {4, 3, 5, 2, 9};
        int length = weights.length;
        int capacity = 7;
        int[][] output = new int[length + 1][capacity + 1];

        int maxProfit = knapsack(weights, values, capacity, length, output);
        System.out.println(maxProfit);
    }

    public static int knapsack(int[] weights, int[] values, int capacity, int length, int[][] output) {


        //i = length and j = capacity
        // Build DP table iteratively
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= capacity; j++) {
                // Base case: If there are no items or capacity is 0
                if (i == 0 || j == 0) {
                    output[i][j] = 0;
                }
                // If item can be included
                else if (weights[i - 1] <= j) {
                    output[i][j] = Math.max(values[i - 1] + output[i - 1][j - weights[i - 1]], output[i - 1][j]);
                }
                // If item cannot be included
                else {
                    output[i][j] = output[i - 1][j];
                }
            }
        }
        return output[length][capacity];
    }
}
