import java.util.Arrays;
public class RunningSum1DArray{
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 0);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
