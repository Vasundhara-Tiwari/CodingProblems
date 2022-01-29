package solutions;

import java.util.Scanner;
import java.util.Stack;

public class DispensableParenthesis {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while(test-- != 0) {
            String str = scanner.nextLine();
            if(dispensable(str))
                System.out.println("Duplicate");
            else
                System.out.println("Not Duplicates");
        }
    }
    public static boolean dispensable(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch !=')') {
                stack.push(ch);
            }
            else {
                if(stack.peek()=='(')
                    return true;
                else {
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
