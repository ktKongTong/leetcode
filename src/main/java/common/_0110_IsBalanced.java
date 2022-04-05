package common;

import ds.TreeNode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/4
 */
public class _0110_IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root == null) {
            return true;
        }
        int a = getHeight(root);
        return a != -2;
    }
    public int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if(left==-2||right==-2||Math.abs(left - right) > 1) {
            return -2;
        }
        return Math.max(left, right) + 1;
    }
}
