package solutions;


public class BinaryTreeFromPreorderInorderTraversal{
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  int index = 0;
  public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length-1);
  }
  public TreeNode build(int[] preorder, int[] inorder, int left, int right){
        if(index == preorder.length || left > right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);
        for(int i = left; i<=right; i++){
            if(preorder[index] == inorder[i]){
                index++;
                root.left = build(preorder, inorder, left, i-1);
                root.right = build(preorder, inorder, i+1, right);
                break;
            }
        }
        return root;
    }
}
