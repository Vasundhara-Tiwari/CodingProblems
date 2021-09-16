package solutions;

import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}, {10,11,12}};
        for(int i=0; i< arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(spiralOrder(arr));
    }
}
