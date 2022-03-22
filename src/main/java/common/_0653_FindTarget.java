package common;

import ds.TreeNode;

import java.util.HashSet;
import java.util.Set;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/21
 */
public class _0653_FindTarget {
    Set<Integer> set = new HashSet<Integer>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
