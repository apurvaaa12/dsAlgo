package org.datastructures.dynamicProgramming;

public class KevinThief {
    public static void main(String[] args) {
        int[] weights = {1, 3, 4};
        int[] values = {3, 5, 6};
        int weight = 7;
        int length = weights.length;
        int maxWeight = knapsack(weights, values, weight, length);
        System.out.println("Weight with recursion: " + maxWeight);

        int maxWeightTopDown = knapsackTopDown(weights, values, weight, length);
        System.out.println("Weights with Top Down: " + maxWeightTopDown);
    }

    //Recursion
    public static int knapsack(int[] weights, int[] values, int weight, int length) {
        if (weight == 0 || length == 0) return 0;

        if (weights[length - 1] <= weight) {
            return Math.max(values[length - 1] + knapsack(weights, values, weight - weights[length - 1], length - 1)
                    , knapsack(weights, values, weight, length - 1));
        } else {
            return knapsack(weights, values, weight, length - 1);
        }
    }

    public static int knapsackTopDown(int[] weights, int[] values, int weight, int length) {
        int[][] t = new int[length + 1][weight + 1];

        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= weight; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
                else if (weights[i - 1] <= j) {
                    t[i][j] = Math.max(values[i - 1] + t[i - 1][j - weights[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[length][weight];
    }
}
