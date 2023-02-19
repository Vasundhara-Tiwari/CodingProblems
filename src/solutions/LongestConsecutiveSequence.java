package solutions;

import java.util.Arrays;

public class LongestConsecutiveSequence{
  public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxLength = 1;
        int length = 1;
        for(int i = 0; i < nums.length - 1;i++){
            if(nums[i]+1 == nums[i+1]) {
                length++;
            }
            else if(nums[i + 1] != nums[i])
            {
                maxLength = Math.max(maxLength, length);
                length = 1;
            }
        }
        return maxLength = Math.max(maxLength, length);
    }
}
