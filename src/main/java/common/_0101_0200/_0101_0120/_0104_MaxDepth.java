package common._0101_0200._0101_0120;

import ds.TreeNode;

/**
 * @Title  二叉树的最大深度
 * @Link   https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * @Author KongTong
 * @Date   2022/4/2
 */
public class _0104_MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
