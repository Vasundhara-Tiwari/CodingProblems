package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumPathSolution {
    public static void main (String args[]) {
        Scanner scanner=new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] board = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j = 0; j< column; j++){
                board[i][j]=scanner.nextInt();
            }
        }
        int[][] dp = new int[row+1][column +1];
        for (int[] i: dp)
            Arrays.fill(i, -1);
        System.out.println(minPath(board,0,0,row-1, column -1,dp));
    }

    public static int minPath(int[][] board, int currentRow, int currentColumn, int endRow, int endColumn, int[][] dp){
        if(currentRow == endRow && currentColumn == endColumn){
            return board[currentRow][currentColumn];
        }
        if(currentRow > endRow || currentColumn > endColumn){
            return Integer.MAX_VALUE;
        }
        if(dp[currentRow][currentColumn]!=-1){
            return dp[currentRow][currentColumn];
        }
        int count1 = minPath(board, currentRow, currentColumn +1, endRow, endColumn,dp);
        int count2 = minPath(board, currentRow +1, currentColumn, endRow, endColumn,dp);
        return dp[currentRow][currentColumn] = Math.min(count1, count2)+ board[currentRow][currentColumn];
    }
}
