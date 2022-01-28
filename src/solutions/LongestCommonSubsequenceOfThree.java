package solutions;

import java.util.Scanner;

public class LongestCommonSubsequenceOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        int[][][] dp = new int[200][200][200];
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                for (int k = 0; k < 200; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        System.out.println(lengthOfLCS(str1, str2, str3, str1.length(), str2.length(), str3.length(),dp));
    }
    public static int lengthOfLCS(String str1, String str2, String str3, int len1, int len2, int len3, int dp[][][]){
        if(len1 ==0 || len2 ==0 || len3 ==0){
            return 0;
        }
        if(dp[len1][len2][len3] != -1){
            return dp[len1][len2][len3];
        }
        if(str1.charAt(len1 -1)== str2.charAt(len2 -1) && str2.charAt(len2 -1)== str3.charAt(len3 -1)){
            return dp[len1][len2][len3] = 1 + lengthOfLCS(str1, str2, str3, len1 -1, len2 -1, len3 -1,dp);
        }
        else{
            return dp[len1][len2][len3] = Math.max( Math.max(lengthOfLCS(str1, str2, str3, len1 -1, len2, len3,dp), lengthOfLCS(str1, str2, str3, len1, len2 -1, len3,dp)) , lengthOfLCS(str1, str2, str3, len1, len2, len3 -1,dp) );
        }
    }
}
