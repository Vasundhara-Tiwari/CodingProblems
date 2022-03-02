package solutions;

import java.util.Scanner;

/**
 * Created by Vasundhara Tiwari
 * On 03-03-2022 at 00:11
 */

public class FirstLastOccurrence {
    static int last = -1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        //System.out.println(firstOccurrence(arr, 0, num));
        //lastOccurrence(arr, 0, num);
        //System.out.println(last);
        allOccurrence(arr, 0, num);
    }
    public static int firstOccurrence(int[] arr, int index, int num){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == num){
            return index;
        }
        return firstOccurrence(arr, index+1, num);
    }
    public static void lastOccurrence(int[] arr, int index, int num){
        if(index == arr.length){
            return;
        }

        if(arr[index] == num){
            last = index;
        }
        lastOccurrence(arr, index+1, num);
    }
    public static void allOccurrence(int[] arr, int index, int num){
        if(index == arr.length){
            return;
        }
        if(arr[index] == num){
            System.out.println(index);
        }
        allOccurrence(arr, index+1, num);
    }
}