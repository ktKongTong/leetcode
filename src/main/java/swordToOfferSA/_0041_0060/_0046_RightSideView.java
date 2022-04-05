package swordToOfferSA._0041_0060;

import ds.TreeNode;

import java.util.*;

/**
 * @Title  二叉树的右侧视图
 * @Link   https://leetcode-cn.com/problems/WNC0Lk/
 * @Author KongTong
 * @Date   2022/3/26
 */
public class _0046_RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        Queue<Integer> depth = new ArrayDeque<>();
        queue.offer(root);
        depth.offer(1);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            int curDepth = depth.poll();
            if (depth.isEmpty() || curDepth < depth.peek()) {
                res.add(cur.val);
            }
            if (cur.left != null) {
                queue.offer(cur.left);
                depth.offer(curDepth + 1);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
                depth.offer(curDepth + 1);
            }
        }
        return res;
    }
}
