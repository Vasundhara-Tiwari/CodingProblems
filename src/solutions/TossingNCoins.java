package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 03-03-2022 at 00:44
 */

public class TossingNCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins = scanner.nextInt();
        combinations(coins, 0, "");
    }
    public static void combinations(int coins, int index, String ans){
        if(index == coins){
            System.out.println(ans);
            return;
        }
        combinations(coins, index+1, ans+"H");
        combinations(coins, index+1, ans+"T");
    }
}