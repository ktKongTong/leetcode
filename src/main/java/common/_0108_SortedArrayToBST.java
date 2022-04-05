package common;

import ds.TreeNode;

import java.util.Arrays;

/**
 * @Title  将有序数组转换为二叉搜索树
 * @Link   https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * @Author KongTong
 * @Date   2022/4/2
 */
public class _0108_SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
        return root;
    }
}
