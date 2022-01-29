package solutions;

import java.util.Scanner;

public class EditDistance1 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int length1 = str1.length();
        int length2 = str2.length();
        int[][] dp = new int[length1 +1][length2 +1];
        for(int i = 0; i< length1 +1; i++){
            dp[i][0] = i;
        }
        for(int j = 0; j< length2 +1; j++){
            dp[0][j] = j;
        }
        for(int i = 1; i< length1 +1; i++){
            for(int j = 1; j< length2 +1; j++){
                if(str1.charAt(i-1)== str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                }
            }
        }
        System.out.println(dp[length1][length2]);
    }
}
