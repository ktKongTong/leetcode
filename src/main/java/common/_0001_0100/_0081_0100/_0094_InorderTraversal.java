package common._0001_0100._0081_0100;

import ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _0094_InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        inorder(root, res);
        return res;
    }
    public void inorder(TreeNode root, List<Integer> res) {
        if(root == null) {
            return;
        }
        if(root.left != null) {
            inorder(root.left, res);
        }
        res.add(root.val);
        if(root.right != null) {
            inorder(root.right, res);
        }
    }
}
