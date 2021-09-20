package solutions;

import java.util.Scanner;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] height = new int[size];
        for(int i=0; i<height.length; i++){
            height[i]=scanner.nextInt();
        }
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {

        int start =0, end = height.length -1;
        int result =0, area=0;

        while(start <end) {
            area = (end- start)*Math.min(height[start],height[end]);
            if(area> result)
                result =area;

            if(height[start]<height[end])
                start++;

            else if(height[start]>height[end])
                end--;

            else {
                if(end- start ==1)
                    break;

                if(end- start ==2)
                    start++;

                else if(height[end-1]>height[start +1])
                    end--;

                else
                    start++;
            }
        }

        return result;
    }
}
