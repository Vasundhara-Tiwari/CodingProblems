package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class NAsSumOf124 {
    public static void main (String args[]) {
        Scanner scanner=new Scanner(System.in);
        int number =scanner.nextInt();
        long[] dp=new long[number +1];
        Arrays.fill(dp,-1);
        System.out.println(count(number,dp));
    }

    public static long count(int number, long[] dp){
        if(number ==0 || number ==1 || number ==2){
            return 1;
        }
        if(number ==3){
            return 2;
        }
        if(dp[number]!=-1){
            return dp[number];
        }
        long count1 = count(number -1,dp);
        long count2 = count(number -3,dp);
        long count3 = count(number -4,dp);
        return dp[number]= count1 + count2 + count3;
    }
}
