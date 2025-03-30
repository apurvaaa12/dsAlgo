package org.datastructures.arrays;

import java.util.Arrays;

//Two players A and B
//A always places X and B always places O
//A always plays first
public class TicTacToeGame {
    public static void main(String[] args) {
        int[][] moves = {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}};
        String output = tictactoe(moves);
        System.out.println(output);
    }

    public static String tictactoe(int[][] moves) {
        int rows = 3, cols = 3;
        char[][] outputGrid = new char[rows][cols];

        // Fill the grid with empty spaces (or you can use '.')
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                outputGrid[i][j] = '.';
            }
        }

        char currentChar = 'A';
        for (int i = 0; i < moves.length; i++) {
            int x = moves[i][0];
            int y = moves[i][1];
            outputGrid[x][y] = currentChar;
            currentChar = (currentChar == 'A') ? 'B' : 'A';
        }

        // Print the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(outputGrid[i][j] + " ");
            }
            System.out.println();
        }
        // Check who wins
        String result = checkWinner(outputGrid);
        System.out.println("Result: " + result);
        return result;
    }

    public static String checkWinner(char[][] board) {
        char[] players = {'A', 'B'};
        for (char player : players) {
            for (int i = 0; i < 3; i++) {
                if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||  // row
                        (board[0][i] == player && board[1][i] == player && board[2][i] == player)) { // column
                    return String.valueOf(player);
                }
            }

            // Check diagonals
            if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                    (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
                return String.valueOf(player);
            }
        }
        // If grid is not completely filled, it's pending
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '.') return "Pending";
            }
        }

        // Otherwise, it's a draw
        return "Draw";
    }
}
