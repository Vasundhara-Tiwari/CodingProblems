public class ThreeSum{
  public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length-1;
            
        }
        return new ArrayList<List<Integer>>(triplets);
    }
} 
