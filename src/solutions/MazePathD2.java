package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 26-04-2022 at 19:15
 */

public class MazePathD2 {
        static boolean result = false;

        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            result = false;
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            char boardPath[][] = new char[num1][num2];
            for (int index1 = 0; index1 < num1; index1++) {
                String str = scanner.next();
                for (int index2 = 0; index2 < num2; index2++) {
                    boardPath[index1][index2] = str.charAt(index2);
                }
            }
            int[][] visitedArray = new int[num1][num2];
            ratChaseSolution(boardPath, 0, 0, visitedArray);
            if (result == false) {
                System.out.print(-1);
            }
        }

        public static void ratChaseSolution(char[][] boardPath, int row, int column, int[][] visitedArray) {
            if (row == boardPath.length - 1 && column == boardPath[0].length) {
                result = true;
                for (int i = 0; i < visitedArray.length; i++) {
                    for (int j = 0; j < visitedArray[0].length; j++) {
                        System.out.print(visitedArray[i][j] + " ");
                    }
                    System.out.println();
                }
                return;
            }
            if (row == -1 || row == boardPath.length || column == -1 || column == boardPath[0].length || visitedArray[row][column] == 1
                    || boardPath[row][column] == 'X' || result == true) {
                return;
            }
            visitedArray[row][column] = 1;
            ratChaseSolution(boardPath, row, column + 1, visitedArray);
            ratChaseSolution(boardPath, row + 1, column, visitedArray);
            visitedArray[row][column] = 0;
        }
}
