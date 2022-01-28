package solutions;

import java.util.*;

public class PaulAndRailywayTrack {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int[] arr1 = new int[num1];

        for(int i = 0; i< num1; i++){
            arr1[i]=scanner.nextInt();
        }

        int[] arr2 = new int[num2];

        for(int j = 0; j< num2; j++){
            arr2[j]=scanner.nextInt();
        }

        int[][] dp = new int[num1 +1][num2 +1];

        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(maxSleepers(arr1, arr2, 0, 0, dp));
    }

    public static int maxSleepers(int[] arr1, int[] arr2, int currArr1, int currArr2, int[][] dp) {
        if(currArr1 == arr1.length || currArr2 == arr2.length) {
            return 0;
        }

        if(dp[currArr1][currArr2] != -1) {
            return dp[currArr1][currArr2];
        }
        if(arr1[currArr1] == arr2[currArr2]) {
            return dp[currArr1][currArr2] =  maxSleepers(arr1, arr2, currArr1 + 1, currArr2 + 1, dp)+1;
        } else {
            int c1 = maxSleepers(arr1, arr2, currArr1, currArr2 + 1, dp);
            int c2 = maxSleepers(arr1, arr2, currArr1 + 1, currArr2, dp);

            return dp[currArr1][currArr2] = Math.max(c1,c2);
        }
    }
}
