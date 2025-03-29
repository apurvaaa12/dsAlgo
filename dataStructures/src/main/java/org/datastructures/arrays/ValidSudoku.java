package org.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

//Each row must contain the digits 1-9 without repetition.
//Each column must contain the digits 1-9 without repetition.
//Each 3x3 sub box must contain the digits 1-9 without repetition.
public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        boolean output = isValidSudoku(board);
        System.out.println(output);
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                // Get the value at the current cell.
                char val = board[row][col];
                // Only check non-empty cells.
                if (val != '.') {
                    // Calculate the block number for the current cell.
                    int block = (row / 3 * 3) + (col / 3);

                    // Check if the value already exists in the current row, column, or block.
                    if (set.contains("r" + row + val) ||
                            set.contains("c" + col + val) ||
                            set.contains("b" + block + val))
                        return false;
                    else {
                        // Add the value to the set for the row, column, and block.
                        set.add("r" + row + val);
                        set.add("c" + col + val);
                        set.add("b" + block + val);
                    }
                }
                System.out.println(set);
            }
        }

        return true;
    }
}
