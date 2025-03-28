package org.datastructures.arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);

    }
    public static int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < minVal){
                minVal=prices[i];
            }else if(prices[i]-minVal>maxProfit){
                maxProfit = prices[i]-minVal;
            }
        }

        return maxProfit;
    }
}
