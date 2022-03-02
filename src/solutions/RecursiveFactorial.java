package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 02-03-2022 at 23:44
 */

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }
    static int factorial(int num){
        if(num == 0 || num == 1)
            return 1;
        return num * factorial(num-1);
    }
}