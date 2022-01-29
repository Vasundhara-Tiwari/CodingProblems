package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class SmartRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase-- != 0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++){
                nums[i] = sc.nextInt();
            }
            int[] cache = new int[n + 1];
            Arrays.fill(cache, -1);
            System.out.println(maxP(nums, 0, n, cache));
        }
    }
    private static int maxP(int[] nums, int current, int num, int[] cache) {
        if(current >= num) {
            return 0;
        }
        if(cache[current] != -1) {
            return cache[current];
        }
        int rob = nums[current] + maxP(nums, current + 2, num, cache);
        int dontRob = maxP(nums, current + 1, num, cache);

        return cache[current] = Math.max(rob, dontRob);
    }
}
