package org.datastructures.dynamicProgramming;

public class Knapsack {
    public static void main(String[] args){
        int[] weights = {1,2,3,4,5};
        int[] value = {4,3,5,2,9};
        int length = weights.length;
        int capacity =7;
        int maxProfit = knapsack(weights,value,capacity,length);
        System.out.println(maxProfit);
    }
    public static int knapsack(int[] weights,int[] values, int capacity, int length){
        //base condition
        if(length == 0 || capacity ==0) return 0;

        //recursion
        if(weights[length-1] <= capacity){
            return Math.max(values[length-1] + knapsack(weights,values,capacity-weights[length-1],length-1)
                    ,knapsack(weights,values,capacity,length-1));
        }else{
            return knapsack(weights,values,capacity,length-1);
        }
    }
}
