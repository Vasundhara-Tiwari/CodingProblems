package solutions;

public class KthLargestElementInArray{
  public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int result = nums[nums.length - k];
        return result;
    }
}
