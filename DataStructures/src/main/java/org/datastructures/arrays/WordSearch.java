package org.datastructures.arrays;

import java.util.Arrays;

//https://youtu.be/m9TrOL1ETxI?feature=shared
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        System.out.println(exist(board, word));
    }

    static boolean[][] vis;

    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int column = board[0].length;
        vis=new boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (board[i][j] == word.charAt(0) && dfs(i, j, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(int i, int j, int index, char[][] board, String word) {
        if(index == word.length()) return true;

        if(i<0 || i>=board.length|| j<0 || j>=board[0].length || word.charAt(index)!= board[i][j] || vis[i][j]) return false;
        vis[i][j] = true;
        if (
                dfs(i + 1, j, index + 1, board, word) ||
                        dfs(i - 1, j, index + 1, board, word) ||
                        dfs(i, j + 1, index + 1, board, word) ||
                        dfs(i, j - 1, index + 1, board, word)) {
            return true;
        }
        vis[i][j] = false;
        return false;
    }
}
