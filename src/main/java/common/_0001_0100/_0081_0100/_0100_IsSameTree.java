package common._0001_0100._0081_0100;

import ds.TreeNode;
/**
 * @Title  相同的树
 * @Link   https://leetcode-cn.com/problems/same-tree/
 * @Author KongTong
 * @Date   2022/4/2
 */
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
