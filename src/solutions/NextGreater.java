package solutions;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {50,30,20,40,10,45,5,65,60,15,8};
        Stack<Integer> answerMemory = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            while (!answerMemory.isEmpty() && arr[i] >= answerMemory.peek()) {
                int ans = answerMemory.pop();
                System.out.println(ans + " - > " + arr[i]);
            }
            answerMemory.push(arr[i]);
        }
        while (!answerMemory.isEmpty()) {
            int ans = answerMemory.pop();
            System.out.println(ans + " - > " + -1);
        }
    }
}
