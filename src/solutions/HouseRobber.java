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
        if(index >= nums.length){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int ans1 = nums[index] + robdp(nums, index+2, dp);
        int ans2 = robdp(nums, index+1, dp);
        dp[index] = Math.max(ans1, ans2);
        return dp[index];
    }
}
