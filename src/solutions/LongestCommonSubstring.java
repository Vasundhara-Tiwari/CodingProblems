package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 02-03-2022 at 20:50
 */

public class LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[size];
        for(int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextLine();
        }
        System.out.println(lcs(arr));
    }
    static String lcs(String[] arr){

        String str = arr[0];
        int length = str.length();
        String result = "";

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String stem = str.substring(i, j);
                int k = 1;
                for (k = 1; k < arr.length; k++)
                    if (!arr[k].contains(stem))
                        break;
                if (k == arr.length && result.length() < stem.length())
                    result = stem;
            }
        }
        return result;
    }
}