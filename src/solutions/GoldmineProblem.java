package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class GoldmineProblem {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for(int i = 0; i< testCase; i++){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int[][] arr = new int[num1][num2];
            int result = -1;
            for(int j = 0; j< num1; j++){
                for(int k = 0; k< num2; k++){
                    arr[j][k] = scanner.nextInt();
                }
            }
            int[][] dp = new int[num1 +1][num2 +1];
            for(int row[]: dp){
                Arrays.fill(row,-1);
            }
            for(int k = 0; k < num1; k++){
                int resR = goldmineSolution(arr, num2, num1, k,0, dp);
                result = Math.max(result,resR);
            }
            System.out.println(result);
        }
    }
    public static int goldmineSolution(int[][] arr, int num2, int num1, int currentRow, int currentColumn, int[][] dp){
        if(currentRow <0 || currentRow == num1 || currentColumn == num2){
            return 0;
        }
        if(dp[currentRow][currentColumn] != -1){
            return dp[currentRow][currentColumn];
        }
        int x1 =  goldmineSolution(arr, num2, num1, currentRow -1, currentColumn +1,dp);
        int x2 = goldmineSolution(arr, num2, num1, currentRow, currentColumn +1,dp);
        int x3 =  goldmineSolution(arr, num2, num1, currentRow +1, currentColumn +1,dp);

        return dp[currentRow][currentColumn] = arr[currentRow][currentColumn] + Math.max(x3,Math.max(x2, x1));
    }
}
