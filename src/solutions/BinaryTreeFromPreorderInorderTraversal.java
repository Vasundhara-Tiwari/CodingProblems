public class BinaryTreeFromPreorderInorderTraversal{
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
