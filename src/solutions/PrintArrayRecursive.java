package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 02-03-2022 at 23:58
 */

public class PrintArrayRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        printReverse(arr, 0);
        print(arr, 0);
    }
    public static void print(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        System.out.println(arr[index]);
        print(arr, index+1);
    }
    public static void printReverse(int[] arr, int index){
        if(index == arr.length){
            return;
        }
        printReverse(arr, index+1);
        System.out.println(arr[index]);
    }
}