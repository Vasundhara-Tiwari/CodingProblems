public class BinaryTreeLevelOrderTraversal{
  
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        traverseTreeInLveleOrder(root, 1, levelOrder);
        return levelOrder;
    }
}
