package solutions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PlayingWithCards {
    static ArrayList<Integer> alPrimes = new ArrayList<Integer>();
    static Stack<Integer> stack = new Stack<>();
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        ithPrime(5679875);
        int[] arr = new int[num1];
        for(int i = 0; i< num1; i++){
            arr[i] = scanner.nextInt();
            stack.push(arr[i]);
        }
        for(int i = 0; i< num2; i++){
            cards(stack, num1,i);
        }
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
    }

    public static void cards(Stack<Integer> stack, int num1, int j){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        int al = alPrimes.get(j);
        while(!stack.empty()){
            int num = stack.pop();
            if(num% al ==0){
                stack2.push(num);
            } else{
                stack1.push(num);
            }
        }
        while (!stack2.empty()){
            System.out.println(stack2.pop());
        }
        while (!stack1.empty()){
            int out = stack1.pop();
            stack3.push(out);
        }
        while(!stack3.empty()){
            PlayingWithCards.stack.push(stack3.pop());
        }
    }

    public static void ithPrime(int num){
        boolean [] IsPrime = new boolean[num];

        for(int i = 0; i < num; i++)
            IsPrime[i] = true;

        for (int p = 2; p * p < num; p++)
        {
            if (IsPrime[p] == true)
            {
                for (int i = p * p; i < num; i += p)
                    IsPrime[i] = false;
            }
        }
        for (int p = 2; p < num; p++)
            if (IsPrime[p] == true)
                alPrimes.add(p);
    }
}
