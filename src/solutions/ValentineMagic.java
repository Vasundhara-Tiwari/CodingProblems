package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ValentineMagic {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int[] boys = new int[num1];
        int[] girls =new int[num2];
        for (int i = 0; i < boys.length; i++) {
            boys[i]= scanner.nextInt();
        }
        for (int i = 0; i <girls.length ; i++) {
            girls[i]= scanner.nextInt();
        }
        Arrays.sort(boys);
        Arrays.sort(girls);
        int[][] dp =new int[boys.length+1][girls.length+1];
        for (int[] value : dp) {
            Arrays.fill(value,-1);
        }
        System.out.println(valentineMagic(boys,girls,0,0, dp));
    }
    public static int valentineMagic(int[] boys, int[] girls, int boysIndex, int girlsIndex, int[][] dp){
        if(boysIndex ==boys.length){
            return 0;
        }
        if(dp[boysIndex][girlsIndex]!=-1){
            return dp[boysIndex][girlsIndex];
        }
        if(girlsIndex ==girls.length){
            return 10000000;
        }
        int a1 =Math.abs(boys[boysIndex]-girls[girlsIndex])+ valentineMagic(boys,girls, boysIndex +1, girlsIndex +1,dp);
        int a2 = valentineMagic(boys,girls, boysIndex, girlsIndex +1,dp);
        return dp[boysIndex][girlsIndex]=Math.min(a1, a2);
    }
}
