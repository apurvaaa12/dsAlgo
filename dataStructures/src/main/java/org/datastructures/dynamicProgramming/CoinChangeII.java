package org.datastructures.dynamicProgramming;

import java.util.Arrays;

public class CoinChangeII {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int output = change(amount, coins);
        System.out.println(output);
    }

    public static int change(int amount, int[] coins) {
        int[] dpArray = new int[amount + 1];
        dpArray[0] = 1;
        for (int current : coins) {
            for (int i = current; i <= amount; i++) {
                dpArray[i] += dpArray[i-current];
            }

        }

        return dpArray[amount];
    }
}
