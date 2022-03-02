package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 02-03-2022 at 23:46
 */

public class FibonacciSeries {
    static int result = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(nthFibonacci(num));
    }
    static int nthFibonacci(int num){
        if(num == 1){
            return 0;
        }
        if(num == 2){
            return 1;
        }
        result = nthFibonacci(num-1) + nthFibonacci(num-2);
        return result;
    }
}