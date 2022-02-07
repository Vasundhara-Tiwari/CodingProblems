package solutions;

import java.util.Scanner;

public class HarryToHogwarts {
    public static int count =0;

    public static int smallestNumber(int number) {
        int[] frequency = new int[10];
        boolean isPosition = (number >0);
        number = Math.abs(number);
        while (number > 0) {
            int d = number % 10;
            if(d==0){
                frequency[0]++;
            }
            frequency[d]++;
            number = number / 10;
        }
        int result = 0;
        while (frequency[0]>0){
            result='0'+result;
            frequency[0]= frequency[0]-1;
        }
        if(isPosition) {
            for (int i = 0 ; i <= 9 ; i++) {
                if (frequency[i] !=0) {
                    result = i;
                    frequency[i]--;
                    break;
                }
            }
            for (int i = 0 ; i <= 9 ; i++)
                while (frequency[i]-- != 0)
                    result = result * 10 + i;

        }
        else {
            for (int i = 9 ; i >= 0 ; i--) {
                if (frequency[i] !=0) {
                    result = i;
                    frequency[i]--;
                    break;
                }
            }
            for (int i =9 ; i >=0 ; i--)
                while (frequency[i]-- != 0)
                    result = result * 10 + i;

            result = -result;
        }
        return result;
    }

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
