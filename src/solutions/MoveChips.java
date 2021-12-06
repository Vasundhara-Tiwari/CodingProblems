package solutions;

import java.util.Scanner;

public class MoveChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i< 3; i++){
            arr[i] = scanner.nextInt();
        }
    }
    public static int minCostToMoveChips(int[] position) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<position.length; i++) {
            if(position[i]%2 == 0) {
                sum1++;
            } else {
                sum2++;
            }
        }
        return (sum1 < sum2) ? sum1 : sum2;
    }
}
