public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>(nums.length);
        explore(0, nums, list, res);
        return res;
    }
    public void explore(int start, int[] nums, List<Integer> list, List<List<Integer>> res) {
        
    }
   
}
