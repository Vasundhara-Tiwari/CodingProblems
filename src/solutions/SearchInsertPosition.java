package solutions;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] nums, int target) {
        return 0;
    }
}
