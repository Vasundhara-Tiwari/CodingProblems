package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 03-03-2022 at 00:27
 */

public class AllSubsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        subsequences(str, 0,"");
        asciiSubsequences(str, 0, "");
    }
    public static void subsequences(String str, int index, String ans) {
        if(index == str.length()){
            System.out.println(ans);
            return;
        }
        subsequences(str, index+1, ans+str.charAt(index));
        subsequences(str, index+1, ans);
    }
    public static void asciiSubsequences(String str, int index, String ans) {
        if(index == str.length()){
            System.out.println(ans);
            return;
        }
        asciiSubsequences(str, index+1, ans+str.charAt(index)+(int)str.charAt(index));
        asciiSubsequences(str, index+1, ans);
    }
}