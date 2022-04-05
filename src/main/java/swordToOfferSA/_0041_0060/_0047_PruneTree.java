package swordToOfferSA._0041_0060;

import ds.TreeNode;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/2
 */
public class _0047_PruneTree {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;
        if(deletable(root.left)){
            root.left = null;
        }
        if (deletable(root.right)){
            root.right = null;
        }
        pruneTree(root.left);
        pruneTree(root.right);
        if(root.val == 0 && root.left == null && root.right == null){
            return null;
        }
        return root;
    }
    private boolean deletable(TreeNode root) {
        if(root == null){
            return true;
        }
        return root.val == 0 && deletable(root.left) && deletable(root.right);
    }
}
