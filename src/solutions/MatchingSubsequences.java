package solutions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 28-02-2022 at 19:55
 */

public class MatchingSubsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        System.out.println(matchingSubsequences(str1, str2, 0, 0, dp));
    }
    public static int matchingSubsequences(String str1, String str2, int m, int n, int[][] dp){
        if(n == str2.length()){
            return 1;
        }
        if(m == str1.length()){
            return 0;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        int inc=0;
        int exc=0;
        if(str1.charAt(m) == str2.charAt(n)){
            inc = matchingSubsequences(str1, str2, m+1, n+1, dp);
        }
        exc = matchingSubsequences(str1, str2, m+1, n, dp);
        return dp[m][n] = inc+exc;
    }
}