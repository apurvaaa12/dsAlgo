package org.datastructures.dynamicProgramming;


import java.util.Arrays;

//https://www.youtube.com/watch?v=1R0_7HqNaW0
public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int output = coinChange(coins, amount);
        System.out.println(output);
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dpArray = new int[amount+1];
        Arrays.fill(dpArray,amount+1);
        dpArray[0] = 0;
        for(int current: coins){
            for(int i = current;i<=amount;i++){
                dpArray[i] = Math.min(dpArray[i],1+ dpArray[i-current]);
            }
        }
        System.out.println(Arrays.toString(dpArray));

        return dpArray[amount] > amount ? -1 : dpArray[amount];
    }
}
