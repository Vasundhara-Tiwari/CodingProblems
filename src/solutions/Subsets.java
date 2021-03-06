package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>(nums.length);
        explore(0, nums, list, res);
        return res;
    }
    public static void explore(int start, int[] nums, List<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            explore(i+1, nums, list, res);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = scanner.nextInt();
        }
        subsets(arr);
    }
}
