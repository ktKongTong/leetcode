package swordToOfferSA._0001_0020;

/**
 * @Title  乘积小于 k 的子数组
 * @Link   https://leetcode-cn.com/problems/ZVAVXX/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0009_MumSubarrayProductLessThanK {
    // 暴力双指针
    public int numSubarrayProductLessThanK(int[] nums, int k){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product  *= nums[j];
                if(product>k){
                    break;
                }
                count++;
            }
        }
        return count;
    }
    // 动态规划
    public int dpNumSubarrayProductLessThanK(int[] nums, int k){
        int n = nums.length;
        // 乘积
        int product = 1;
        int left = 0, right = 0;
        int count = 0;
        for(; right < n; right++){
            // 当 mul < k 扩展滑动窗口的右边界
            product *= nums[right];
            //当 mul >= k, 收缩滑动窗口的左边界
            while(left <= right && product >= k){
                count += n-right;
                product /= nums[left++];
            }
        }
        return n*(1+n) / 2 - count;
    }
}
