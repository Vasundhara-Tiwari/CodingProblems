package solutions;

import java.util.Scanner;
import java.util.Stack;

public class FormNumberFromGivenSequence {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String str1 = scanner.nextLine();
        String[] s1 = str1.split(" ");
        for(String str : s1) {
            formMinimunNumber(str);
        }
    }
    public static void formMinimunNumber(String str) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <= str.length(); i++) {
            stack.push(i+1);
            if(i == str.length()|| str.charAt(i)=='I') {
                while(!stack.isEmpty())
                    System.out.print(stack.pop());
            }
        }
        System.out.println();
    }
}
