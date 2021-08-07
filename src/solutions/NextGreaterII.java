package solutions;

import java.util.Stack;

public class NextGreaterII {
    public static void main(String[] args) {

        int[] arr = {50,30,20,40,10,45,5,65,60,15,8};
        Stack<Integer> Potential_nxt = new Stack<Integer>();
        for (int i = arr.length-1; i >= 0; i--) {

            while(!Potential_nxt.isEmpty() && arr[i]>=Potential_nxt.peek()) {
                Potential_nxt.pop();
            }
            if(Potential_nxt.isEmpty()) {
                System.out.println(arr[i] + " -> "+ -1);
            }
            else {
                System.out.println(arr[i] + " -> "+ Potential_nxt.peek());
            }

            Potential_nxt.push(arr[i]);
        }

    }
}
