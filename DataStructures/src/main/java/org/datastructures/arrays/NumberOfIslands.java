package org.datastructures.arrays;

public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        int numIslands = numIslands(grid);
        System.out.println(numIslands);

    }

    public static int numIslands(char[][] grid) {
        if (grid.length == 0 || grid == null) return 0;

        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numIslands = numIslands + dfs(grid, i, j);
                }
            }
        }
        return numIslands;

    }

    public static int dfs(char[][] grid, int start, int end) {
        if (start < 0 || start >= grid.length || end < 0 || end >= grid[start].length || grid[start][end] == '0')
            return 0;

        //Marking it as visited
        grid[start][end] = '0';
        dfs(grid, start + 1, end);
        dfs(grid, start - 1, end);
        dfs(grid, start, end + 1);
        dfs(grid, start, end - 1);

        return 1;
    }
}
