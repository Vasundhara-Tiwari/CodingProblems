package solutions;

import java.util.Scanner;

public class MinimumCostClimbingStairs {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(minimumCost(arr, size));
    }
    static int minimumCost(int[] cost, int size){
        int dp[] = new int[size];

        if (size == 1)
            return cost[0];

        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < size; i++){
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[size - 2], dp[size - 1]);
    }
}
