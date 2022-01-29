package solutions;

import java.util.Scanner;

public class CountBinaryStrings {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- != 0){
            long number = scanner.nextLong();
            System.out.println(countStrings(number));
        }
    }
    public static long countStrings(long number) {
        if(number < 1)
            return 0;

        long count0 = 1;
        long count1 = 1;

        for(int i = 1; i< number; i++)
        {
            long temp = count1;
            count1 = count0;
            count0 = count0 + temp;
        }

        return count0 + count1;
    }
}
