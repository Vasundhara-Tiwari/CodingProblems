package solutions;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for(int row = 0; row < size; row++)
            for(int column = 0; column < size; column++)
                arr[row][column] = scanner.nextInt();
        
        celebrity(arr);

    }
    public static void celebrity(int[][] relation){
        Stack<Integer> Potential = new Stack<>();
        for (int i = 0; i < relation.length; i++) {
            Potential.push(i);
        }
        while (Potential.size() > 1) {
            int A = Potential.pop();
            int B = Potential.pop();
            if (relation[A][B] == 1) {
                Potential.push(B);
            } else {
                Potential.push(A);
            }
        }
        int Celeb = Potential.pop();
        for (int j = 0; j < relation.length; j++) {
            if (relation[Celeb][j] == 1) {
                System.out.println("No Celebrity");
                return;
            }
            if (j != Celeb && relation[j][Celeb] == 0) {
                System.out.println("No Celebrity");
                return;
            }
        }
        System.out.println(Celeb);
    }
}
