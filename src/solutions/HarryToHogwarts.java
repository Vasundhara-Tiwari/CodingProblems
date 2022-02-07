package solutions;

import java.util.Scanner;

public class HarryToHogwarts {

    static int printMaximum(int number) {
        int[] count = new int[10];
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i) - '0']++;
        int result = 0, multiplier = 1;
        for (int i = 0; i <= 9; i++) {
            while (count[i] > 0) {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        countNumberOfTimes(sc.nextInt());
        System.out.println(count);
    }
}
