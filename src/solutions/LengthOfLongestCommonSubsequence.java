package solutions;

import java.util.*;

public class LengthOfLongestCommonSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(lengthOfLCS(str1, str2, str1.length(), str2.length(),dp));
    }
    public static int findMax(int a, int b)
    {
        return (a > b)? a : b;
    }
    public static int lengthOfLCS(String str1, String str2, int m , int n, int dp[][]){
        if(m==0 || n==0){
            return 0;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        if(str1.charAt(m-1)== str2.charAt(n-1)){
            return dp[m][n] = 1 + lengthOfLCS(str1, str2,m-1,n-1,dp);
        }
        return dp[m][n] = findMax( lengthOfLCS(str1, str2,m-1,n,dp), lengthOfLCS(str1, str2,m,n-1,dp) );
    }
}