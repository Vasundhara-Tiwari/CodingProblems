package solutions;

public class IntersectionOfTwoArrays{
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    l.add(nums2[j]);
                    nums2[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        int k=0;
        int arr[]= new int [l.size()];   
        for(int m: l){ 
            arr[k++]=m;
        }
        return arr;
    }
}
