package org.datastructures.dynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class knapsackMemoised {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {4, 3, 5, 2, 9};
        int length = weights.length;
        int capacity = 7;
        int[][] output = new int[length + 1][capacity + 1];

        // Initialize the memoization table with -1
        for (int i = 0; i <= length; i++) {
            Arrays.fill(output[i], -1);
        }

        int maxProfit = knapsack(weights, values, capacity, length, output);
        System.out.println(maxProfit);
    }

    public static int knapsack(int[] weights, int[] values, int capacity, int length, int[][] output) {
        // Base Case: If no items are left or capacity is 0
        if (length == 0 || capacity == 0) {
            return 0;
        }

        // If the result is already computed, return it
        if (output[length][capacity] != -1) {
            return output[length][capacity];
        }

        // If the item can be included in the knapsack
        if (weights[length - 1] <= capacity) {
            output[length][capacity] = Math.max(
                    values[length - 1] + knapsack(weights, values, capacity - weights[length - 1], length - 1, output),
                    knapsack(weights, values, capacity, length - 1, output)
            );
        } else { // If the item cannot be included
            output[length][capacity] = knapsack(weights, values, capacity, length - 1, output);
        }

        return output[length][capacity];
    }
}
