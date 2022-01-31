package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class TilingProblemI {
    public static void main (String args[]) {
        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        long[] dp=new long[num +1];
        Arrays.fill(dp,-1);
        System.out.println(tilingProblem(num,dp));
    }
    public static long tilingProblem(int num, long[] dp){
        if(num ==0){
            return 0;
        }
        if(num ==1 || num ==2){
            return num;
        }
        if(dp[num]!=-1){
            return dp[num];
        }
        long count1 = tilingProblem(num -1,dp);
        long count2 = tilingProblem(num -2,dp);
        return dp[num]= count1 + count2;
    }
}
