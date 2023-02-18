package solutions;

public class LowestCommonAncestor{
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root){
            return root;
        }
        TreeNode right = lowestCommonAncestor(root.right , p , q);
        TreeNode left = lowestCommonAncestor(root.left , p , q); 
        if(right == null){
            return left;
        }
        if(left == null){
            return right;
        }
        return root;
  }
}
