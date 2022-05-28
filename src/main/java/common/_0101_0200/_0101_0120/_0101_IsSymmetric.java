package common._0101_0200._0101_0120;

import ds.TreeNode;

/**
 * @Title  对称二叉树
 * @Link   https://leetcode-cn.com/problems/symmetric-tree/
 * @Author KongTong
 * @Date   2022/4/2
 */
public class _0101_IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compare(root.left, root.right);
    }
    public boolean compare(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return compare(left.left, right.right) && compare(left.right, right.left);
    }
}
