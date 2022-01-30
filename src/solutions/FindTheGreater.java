package solutions;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class FindTheGreater {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i< size; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = nextGreaterCircular(arr);
        for(int i: result) {
            System.out.print(i+" ");
        }
    }
    public static int[] nextGreaterCircular(int[] a) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[a.length];
        Arrays.fill(result,Integer.MIN_VALUE);
        int j=0;
        for(int i=0;i<2*a.length;i++) {
            if(j==a.length)
                j=0;
            while(!stack.isEmpty() && a[stack.peek()]<a[j]) {
                int d = stack.pop();
                result[d] = a[j];
            }
            if(result[j]==Integer.MIN_VALUE)
                stack.push(j);
            j=j+1;
        }
        while(!stack.isEmpty()) {
            int d = stack.pop();
            result[d] = -1;
        }
        return result;
    }
}
