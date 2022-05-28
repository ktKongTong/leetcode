package common._0501_1000;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/24
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
public class _0965_IsUnivalTree {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = treeValue(root.left);
        int right = treeValue(root.right);
        if(left == -2 && right == -2){
            return true;
        } else if (left == -2){
            return right == root.val;
        } else if (right == -2){
            return left == root.val;
        } else {
            return left == right && left == root.val;
        }
    }
    public int treeValue(TreeNode root){
        if(root == null){
            return -2;
        }
        int left = treeValue(root.left);
        int right = treeValue(root.right);

        if(left == -2 && right == -2){
            return root.val;
        }
        // 左右都不为-2
        if(left != -2 && right != -2){
            return left == right && left == root.val ? root.val : -1;
        }
        // 左右有一个为-2
        if(left == -2){
            return right == root.val ? root.val : -1;
        }
        return left == root.val ? root.val : -1;
    }
}
