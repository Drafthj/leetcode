package InvertBinaryTree_226;

/**
 * Created by drafthj on 2016/11/28 14:40.
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root != null) {
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
