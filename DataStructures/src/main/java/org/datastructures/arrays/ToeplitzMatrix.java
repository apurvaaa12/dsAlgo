package org.datastructures.arrays;

public class ToeplitzMatrix {
    public static void main(String[] args){
//        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] matrix = {{11,74,0,93},{40,11,74,7}};
        System.out.println(isToeplitzMatrix(matrix));
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
