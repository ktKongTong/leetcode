package swordToOfferSA._0041_0060;

import ds.TreeNode;

/*
* @Link https://leetcode-cn.com/problems/NYBBNL/
* @Title 展平二叉搜索树
* @Author KongTong
* @Date 2022/03/15
* */
public class _0052_IncreasingBST {
    /*
    * @Author KongTong
    * @Description
    * */
    public TreeNode increasingBST(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left;
        left = increasingBST(root.left);
        root.left = null;
        // 找左边末尾节点
        if(left != null){
            TreeNode cur = left;
            while(cur.right != null){
                cur = cur.right;
            }
            cur.left = null;
            cur.right = root;
        }

        root.right = increasingBST(root.right);
        if(left != null){
            return left;
        }
        return root;
    }
}