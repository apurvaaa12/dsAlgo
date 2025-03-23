package org.datastructures.dynamicProgramming.basicDp;

import java.util.Arrays;

public class MinPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        for (int i = 0; i < grid.length; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
        int minPath = minPathSum(grid);
        System.out.println(minPath);
    }


    public static int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[][] dp = new int[row][column];
        return move(grid, row - 1, column - 1, dp);
    }

    public static int move(int[][] grid, int row, int column, int[][] dp) {
        if (row == 0 || column == 0) return grid[row][column];
        else if (row < 0 && column < 0) return Integer.MAX_VALUE;
        else if (dp[row][column] != 0) return dp[row][column];
        return dp[row][column] = grid[row][column]
                + Math.min(move(grid, row - 1, column, dp), move(grid, row, column - 1, dp));
    }

// static int min = Integer.MAX_VALUE;
//    public static int minPathSum(int[][] grid) {
//
//        int row = grid.length;
//        int column = grid[0].length;
//        boolean[][] vis = new boolean[row][column];
//        move(grid, 0, 0, vis, 0);
//        return min;
//    }
//
//    public static void move(int[][] grid, int i, int j, boolean[][] vis, int result) {
//        int row = grid.length;
//        int column = grid[0].length;
//        if (i < 0 || i >= row || j < 0 || j >= column || vis[i][j]) {
//            return;
//        }
//
//        result = result + grid[i][j];
//
//        if (i == row - 1 && j == column - 1) {
//            min = Math.min(min, result);
//            return;
//        }
//        vis[i][j] = true;
//        move(grid, i + 1, j, vis, result);
//        move(grid, i, j + 1, vis, result);
//        vis[i][j] = false;
//
//    }
}
