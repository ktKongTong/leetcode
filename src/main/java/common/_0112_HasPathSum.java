package common;

import ds.TreeNode;

import java.util.Stack;

/**
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/4/5
 */
public class _0112_HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        //DFS
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return root.val == sum;
        }
        if(root.left!= null) {
            root.left.val += root.val;
        }
        if (root.right != null) {
            root.right.val += root.val;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
    public boolean DFS(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null) {
            return root.val == sum;
        }
        if(root.left!= null) {
            root.left.val += root.val;
        }
        if (root.right != null) {
            root.right.val += root.val;
        }
        return DFS(root.left, sum) || DFS(root.right, sum);
    }
}
