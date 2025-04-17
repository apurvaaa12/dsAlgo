package org.datastructures.arrays;

public class CarPooling {
    public static void main(String[] args) {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 5;
        boolean isPossible = carPooling(trips, capacity);
        System.out.println(isPossible);
    }

    public static boolean carPooling(int[][] trips, int capacity) {
        int sum = 0;
        for (int i = 0; i < trips.length; i++) {
            sum = sum + trips[i][0];
        }
        if (sum == capacity) {
            return true;
        }

        return false;
    }
}
