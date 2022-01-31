package solutions;

import java.util.Scanner;
import java.util.Stack;

public class FriendAndGame {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();
        while(testCases-- != 0) {
            String str1 = scanner.nextLine();
            String str2 = "";
            for(int i = 0; i< str1.length(); i++)
            {
                if(str1.charAt(i)%2==0)
                    str2 +="I";
                else
                    str2 +="D";
            }
            formMinimumNumber(str2);
        }

    }
    public static void formMinimumNumber(String str) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<= str.length(); i++)
        {
            stack.push(i+1);
            if(i== str.length()|| str.charAt(i)=='I')
            {
                while(!stack.isEmpty())
                    System.out.print(stack.pop());
            }
        }
        System.out.println();
    }
}
