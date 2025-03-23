package org.datastructures.dynamicProgramming.basicDp;


//To reach nth step, what could have been your previous steps? (Think about the step sizes)
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 9;
        int distinctWays = climbStairs(n);
        System.out.println(distinctWays);
    }


    //3 , 1, 1+2 , 2+1
    public static int climbStairs(int n) {
        int[] dpArray = new int[n + 1];
        dpArray[0] = 1;
        dpArray[1] = 1;
        for (int i = 2; i <= n; i++) {
            dpArray[i] = dpArray[i - 1]+dpArray[i - 2] ;
        }
        return dpArray[n];
    }
}
