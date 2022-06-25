public class NonDecreasingArray{
  public boolean checkPossibility(int[] nums) {
        int modified = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (modified++ > 0) return false;
                
            }
        }
        return true;
    }
}
