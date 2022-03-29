package swordToOfferSA._0001_0020;

/*
* @Title  左右两边子数组的和相等
* @Link   https://leetcode-cn.com/problems/tvdfij/
* @Author KongTong
* @Date   2022/3/15
* */
public class _0012_PivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum =0;
        for (int num : nums) {
            rightSum += num;
        }
        for (int pivotIndex = 0; pivotIndex < nums.length; pivotIndex++) {
            leftSum +=nums[pivotIndex];
            rightSum -= nums[pivotIndex];
            if(leftSum-nums[pivotIndex]==rightSum){
                return pivotIndex;
            }
        }
        return -1;
    }
}
