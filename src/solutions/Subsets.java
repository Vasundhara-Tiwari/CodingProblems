package solutions;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>(nums.length);
        explore(0, nums, list, res);
        return res;
    }
    public void explore(int start, int[] nums, List<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            explore(i+1, nums, list, res);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {

    }
}
