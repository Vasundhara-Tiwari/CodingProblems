package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class KOrderedLCS {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int[] sequence1 = new int[num1];
        int[] sequence2 = new int[num2];
        for(int i = 0; i< num1; i++){
            sequence1[i] = scanner.nextInt();
        }
        for(int j = 0; j< num2; j++){
            sequence2[j] = scanner.nextInt();
        }
        int[][][] dp = new int[num1 +1][num2 +1][num3 +1];
        for(int[][] arr: dp){
            for(int[] arr1: arr){
                Arrays.fill(arr1,-1);
            }
        }
        System.out.println(kOrderLCS(sequence1, sequence2, num1, num2, num3,dp));

    }

    public static int kOrderLCS(int[] sequence1, int[] sequence2, int num1, int num2, int num3, int[][][] dp ){
        if(num3 <0){
            return Integer.MIN_VALUE;
        }
        if(num1 <=0 || num2 <=0){
            return 0;
        }
        if(dp[num1][num2][num3] != -1){
            return dp[num1][num2][num3];
        }
        int answer = Math.max(kOrderLCS(sequence1, sequence2, num1 -1, num2, num3,dp), kOrderLCS(sequence1, sequence2, num1, num2 -1, num3,dp));
        if(sequence1[num1 -1] == sequence2[num2 -1]){
            answer = Math.max(answer, 1+ kOrderLCS(sequence1, sequence2, num1 -1, num2 -1, num3,dp));
        }
        answer = Math.max(answer, 1+ kOrderLCS(sequence1, sequence2, num1 -1, num2 -1, num3 -1,dp));
        return dp[num1][num2][num3] = answer;

    }
}
