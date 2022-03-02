package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 02-03-2022 at 23:39
 */

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printIncreasing(num);
    }
    static void printIncreasing(int num){
        if(num == 0)
            return;
        printIncreasing(num-1);
        System.out.println(num);
    }
}