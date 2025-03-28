package org.datastructures.dynamicProgramming;

import java.util.Dictionary;
import java.util.HashMap;

//Initially we take an empty Dictionary called memo
//Base case: We check if the fib(n) is already present in the memo if yes we return memo[n]
//           If n<= 2 then we return 1
//fib(n) = fib(n-1)+fib(n-2)
//memo[n] = fib(n)
//return memo(n)
public class Memoization {

    public static void main(String[] args){
        int n = 4;
        int output = fib(n);
        System.out.println(output);
    }

    public static int fib(int n) {
//        HashMap<Integer, Integer> memo = new HashMap<>();
//        // Check if the value is already in the memo
//        if (memo.containsKey(n)) {
//            return memo.get(n);
//        }
//        if (n <= 2) {
//            return 1;
//        }
//        int result = fib(n - 1) + fib(n - 2);
//        memo.put(n, result); // Store the result in the memo
//
//        return result;
////        if(n<=2){
////            return 1;
////        }
////        else{
////           return fib(n-1)+fib(n-2);
////        }
//
////        0,1,2,3,5

        if(n==0) return 0;
        int first = 1;
        int second =0;
        int current =1;

        for(int i=2;i<=n;i++){
            current = first+second; //1+0 //1+1
            second = first; // 0->1
            first=current; // 1->1 //
        }

        return first;
    }
}
