package common;

import ds.TreeNode;

public class _0100_IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 双空
        if(p == null && q == null) {
            return true;
        }
        // 单空一个
        if(p == null || q == null) {
            return false;
        }
        // 都存在
        return isSameTree(p.left,q.left) && p.val == q.val && isSameTree(p.right,q.right);
    }
}
