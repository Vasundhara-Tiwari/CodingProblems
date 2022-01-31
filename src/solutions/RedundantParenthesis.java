package solutions;

import java.util.Scanner;
import java.util.Stack;

public class RedundantParenthesis {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while(test-- != 0) {
            String str = scanner.nextLine();
            if(redundant(str))
                System.out.println("Duplicate");
            else
                System.out.println("Not Duplicates");
        }
    }
    public static boolean redundant(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if(ch !=')') {
                stack.push(ch);
            }
            else {
                if(stack.peek()=='(')
                    return true;
                else{
                    while(!stack.isEmpty() && stack.peek()!='(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            }
        }
        return false;
    }
}
