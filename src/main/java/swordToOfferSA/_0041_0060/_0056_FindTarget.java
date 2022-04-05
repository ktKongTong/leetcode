package swordToOfferSA._0041_0060;

import ds.TreeNode;

import java.util.HashMap;

/**
 * @Title  二叉搜索树中两个节点之和
 * @Link   https://leetcode-cn.com/problems/opLdQZ/
 * @Author KongTong
 * @Date   2022/3/16
 */
public class _0056_FindTarget {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        HashMap<Integer, TreeNode> map = new HashMap<>();
        return find(root, k, map);
    }
    public boolean find(TreeNode root, int k, HashMap<Integer, TreeNode> map) {
        if (root == null) {
            return false;
        }
        if (map.containsKey(k - root.val)) {
            return true;
        }
        map.put(root.val, root);
        return find(root.left, k, map) || find(root.right, k, map);
    }
}
