package solutions;

import java.util.Scanner;

public class ClimbingStairs1 {
    public static void main (String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        int dp[] = new int[100];
        for(int i=0;i<100;i++){
            dp[i] = -1;
        }
        System.out.println(climbStairs(num,dp));
    }
    public static int climbStairs(int num, int dp[]){
        if(num <0){
            return 0;
        }
        if(num ==0){
            return 1;
        }
        if(dp[num] !=-1){
            return dp[num];
        }
        else{
            return dp[num] = climbStairs(num -1,dp) + climbStairs(num -2,dp);
        }
    }
}
