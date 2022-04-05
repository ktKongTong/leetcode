package common;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/4
 */
public class _0307_NumArray {
    private final int[] nums;
    private final int[] preSums;
    public _0307_NumArray(int[] nums) {
        this.nums = nums;
        preSums = new int[nums.length + 1];
        preSums[0] = 0;
        // 前缀和
        for (int i = 0; i < nums.length; i++) {
            preSums[i + 1] = nums[i]+preSums[i];
        }
    }

    public void update(int index, int val) {
        // 更新前缀和
        for (int i = index + 1; i < preSums.length; i++) {
            preSums[i] += val - nums[index];
        }
        nums[index] = val;
    }

    public int sumRange(int left, int right) {
        return preSums[right + 1] - preSums[left];
    }

}
