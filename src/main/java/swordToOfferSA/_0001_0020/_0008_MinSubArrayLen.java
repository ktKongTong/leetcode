package swordToOfferSA._0001_0020;

/**
 * @Title  和大于等于 target 的最短子数组
 * @Link   https://leetcode-cn.com/problems/2VG8Kg/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0008_MinSubArrayLen {
    /*
    * 滑动窗口
    * */
    public int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
