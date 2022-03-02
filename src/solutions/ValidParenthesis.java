package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 03-03-2022 at 00:47
 */

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        validPair(num, 0, "", 0, 0);
    }
    public static void validPair(int num, int index, String ans, int open, int closed){
        if(num * 2 == index){
            System.out.println(ans);
            return;
        }
        if(open < num) {
            validPair(num, index + 1, ans + "(", open + 1, closed);
        }
        if(open > closed) {
            validPair(num, index + 1, ans + ")", open, closed + 1);
        }
    }
}