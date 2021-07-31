package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        m=scanner.nextInt();
        n=scanner.nextInt();
        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        for(int i=0 ; i<m; i++){
            nums1[i]=scanner.nextInt();
        }
        for(int i=0 ; i<n; i++){
            nums2[i]=scanner.nextInt();
        }
        merge(nums1, m, nums2, n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m+n];
        for(int i=0 ;i<m+n; i++){
            if(nums1[i]<nums2[m-n-i]){
                nums3[i] = nums1[i];
            } else {
                nums3[i] = nums2[i];
            }
        }
        System.out.println(Arrays.toString(nums3));
    }
}
