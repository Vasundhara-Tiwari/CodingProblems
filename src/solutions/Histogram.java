package solutions;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long[] arr = new long[number];
        for (int i = 0; i < number; i++)
            arr[i] = scanner.nextLong();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        long area = 0;
        for (int i = 0; i < number; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int test = stack.peek();
                stack.pop();

                if (stack.isEmpty()) {
                    area = Math.max(area, arr[test] * i);
                } else {
                    area = Math.max(area, arr[test] * (i - stack.peek() - 1));
                }
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int test = stack.peek();
            stack.pop();

            if (stack.empty()) {
                area = Math.max(area, arr[test] * number);
            } else {
                area = Math.max(area, arr[test] * (number - stack.peek() - 1));
            }
        }
        System.out.println(area);
    }
}
