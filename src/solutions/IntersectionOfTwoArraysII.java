package solutions;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args)
    {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2)
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else
            {
                nums1[k++]=nums1[i];
                ++i;++j;
            }
        }

        int[] result = new int[k];
        for(i=0;i<k;i++){
            result[i]=nums1[i];
        }
        return result;
    }
}
