public class ThreeSum{
  public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        Arrays.sort(nums);
        
        return new ArrayList<List<Integer>>(triplets);
    }
} 
