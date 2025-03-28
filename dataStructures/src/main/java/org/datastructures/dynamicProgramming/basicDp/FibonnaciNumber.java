package org.datastructures.dynamicProgramming.basicDp;

public class FibonnaciNumber {
    public static void main(String[] args) {
        int n = 4;
        int fibNumber = fib(n);
        System.out.println(fibNumber);
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        int current = 1;
        int previous = 1;
        int secondPrevious = 0;
        for (int i = 2; i <= n; i++) {
            current = previous + secondPrevious;
            secondPrevious = previous;
            previous = current;
        }

        return previous;
    }
}
