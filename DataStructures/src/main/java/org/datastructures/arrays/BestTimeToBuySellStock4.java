package org.datastructures.arrays;

public class BestTimeToBuySellStock4 {
    public static void main(String[] args) {
        int[] prices = {3, 2, 6, 5, 0, 3};
        int k = 2;
        int maxProfit = maxProfit(k, prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int k, int[] prices) {
        int length = prices.length;
        if (length <= 1)
            return 0;

        ////if k >= length/2, then you can make maximum number of transactions.
        //Greedy approach
        if (k >= length / 2) {
            int maxPro = 0;
            for (int i = 1; i < length; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxPro = maxPro + prices[i] - prices[i - 1];
                }
            }
            return maxPro;
        }

        // DP approach: Create a table where dp[i][j] represents max profit
        // using at most i transactions up to day j
        int[][] dpArray = new int[k + 1][length];
        for (int i = 1; i <= k; i++) {
            int localMax = dpArray[i - 1][0] - prices[0]; // Tracks the max profit after buying
            for (int j = 1; j < length; j++) {
                // Either don't sell on day j (dp[i][j-1]) OR sell on day j (prices[j] + localMax)
                dpArray[i][j] = Math.max(dpArray[i][j - 1], prices[j] + localMax);
                // Update localMax to track the best time to buy stock
                localMax = Math.max(localMax, dpArray[i - 1][j] - prices[j]);
            }
        }
        return dpArray[k][length - 1];
    }
}
