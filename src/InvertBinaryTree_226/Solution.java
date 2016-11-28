package InvertBinaryTree_226;

import java.util.LinkedList;
import java.util.Queue;

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
    public TreeNode invertTree2(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            TreeNode t = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = t;
            if(treeNode.right!=null){
                queue.add(treeNode.right);
            }
            if(treeNode.left!=null){
                queue.add(treeNode.left);
            }
        }
        return root;
    }
}
