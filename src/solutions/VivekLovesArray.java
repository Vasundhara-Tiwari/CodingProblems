package solutions;

import java.util.Scanner;

public class VivekLovesArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int t=scn.nextInt();
        for(int w=1;w<=t;w++)
        {
            int n=scn.nextInt();
            int []arr=new int [n];
            for(int i=0;i<n;i++)
            {
                arr[i]=scn.nextInt();
            }
            System.out.println(splitarray(arr, 0, n-1));
        }
    }
    public static int splitarray(int []arr,int si,int ei) {
        for(int br=si;br<ei;br++)
        {
            int sum1=0;
            for(int i=si;i<=br;i++)
            {
                sum1+=arr[i];
            }
            int sum2=0;
            for(int i=br+1;i<=ei;i++)
            {
                sum2+=arr[i];
            }
            if(sum1==sum2)
            {
                int l=splitarray(arr,si,br);
                int r=splitarray(arr, br+1, ei);
                return Math.max(l, r)+1;
            }
        }
        return 0;
    }
}
