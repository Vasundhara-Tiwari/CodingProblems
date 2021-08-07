package solutions;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater1 {
    public static void main(String[] args) {
        int[] arr = {50,30,20,40,10,45,5,65,60,15,8};
        Stack<Integer> Ans_Memory = new Stack<Integer>();
        int[] ans_order = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!Ans_Memory.isEmpty() && arr[i] >= arr[Ans_Memory.peek()]) {
                int idx = Ans_Memory.pop();
                ans_order[idx] = arr[i];
                System.out.println("[" + idx+ "]" + " - > " + arr[i]);
                System.out.println(Arrays.toString(ans_order));

            }
            Ans_Memory.push(i);
        }

        while (!Ans_Memory.isEmpty()) {
            int idx = Ans_Memory.pop();
            ans_order[idx] = -1;
            System.out.println("[" + idx+ "]" + " - > " + -1);
        }
        System.out.println("------------");
    }
}
