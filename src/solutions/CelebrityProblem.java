package solutions;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 0 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
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
        }int Celeb = Potential.pop();
        for (int jj = 0; jj < relation.length; jj++) {
//			Check row
            if (relation[Celeb][jj] == 1) {
                System.out.println("Lies!! No Celeb !! ");
                return;
            }
//			Check col of Celeb
            if (jj != Celeb && relation[jj][Celeb] == 0) {
                System.out.println("Lies!! No Celeb !! ");
                return;
            }
        }
        System.out.println(Celeb + " is a real person!! ");
    }
}
