package common._0101_0200;

import ds.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/4/8
 */
public class _0145_PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root,list);
        return list;
    }
    public void postOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postOrder(root.left,list);
        postOrder(root.right,list);
        list.add(root.val);
    }
}
