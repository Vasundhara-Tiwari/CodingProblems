package solutions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 28-02-2022 at 19:18
 */

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amount = sc.nextInt();
        int[] coins = new int[n];
        for(int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int[][] dp = new int[amount+1][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        System.out.println(noOfWays(coins, amount, 0, dp));
    }
    public static int noOfWays(int[] coin, int amount, int index, int[][] dp){
        if(amount == 0){
            return 1;
        }
        if (index == coin.length){
            return 0;
        }
        if (dp[amount][index] != -1){
            return dp[amount][index];
        }
        int inc=0;
        int exc=0;
        if(amount>=coin[index]){
            inc = noOfWays(coin, amount-coin[index], index, dp);
        }
        exc = noOfWays(coin, amount, index+1, dp);
        return dp[amount][index] = inc+exc;
    }
}