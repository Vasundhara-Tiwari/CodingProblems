public class BinaryTreeFromPreorderInorderTraversal{
  int index = 0;
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    return build(preorder, inorder, 0, preorder.length-1);
  }
}
