package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 02-03-2022 at 23:41
 */

public class PrintIncDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printDecInc(num);
    }
    static void printDecInc(int num){
        if(num == 0)
            return;
        System.out.println(num);
        printDecInc(num-1);
        System.out.println(num);
    }
}