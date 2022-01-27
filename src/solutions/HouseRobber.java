package solutions;

import java.util.Arrays;

public class HouseRobber {
    static int index = 0;
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp, -1);
        int ans = robdp(nums, index, dp);
        return ans;
    }
    public static int robdp(int[] nums, int index, int[] dp){

        return dp[index];
    }
}
