package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 02-03-2022 at 23:35
 */

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printDecreasing(num);
    }
    static void printDecreasing(int num){
        if(num == 0)
            return;
        System.out.println(num);
        printDecreasing(num-1);
    }
}