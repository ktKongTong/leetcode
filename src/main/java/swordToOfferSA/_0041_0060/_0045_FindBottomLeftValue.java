package swordToOfferSA._0041_0060;

import ds.TreeNode;

import java.util.Stack;

/**
 * @Title  二叉树最底层最左边的值
 * @Link   https://leetcode-cn.com/problems/LwUNpT/
 * @Author KongTong
 * @Date   2022/3/24
 */
public class _0045_FindBottomLeftValue {
    private int maxDepth;
    private int result;

    public int findBottomLeftValue(TreeNode root) {
        maxDepth = 0;
        traverse(root, 0);
        return result;
    }

    private void traverse(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        // 遍历到了新的一层，且当前节点为该层的最左侧节点
        if (maxDepth == depth) {
            result = root.val;
            maxDepth++;
        }
        traverse(root.left, depth + 1);
        traverse(root.right, depth + 1);
    }
}
