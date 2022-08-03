public class ArrayToBST{
  public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        return constructTree(nums, 0, nums.length -1);
    }
   public TreeNode constructTree(int[] nums,int left, int right){

        if(left>right){ return null;}
    
        
    }
}
