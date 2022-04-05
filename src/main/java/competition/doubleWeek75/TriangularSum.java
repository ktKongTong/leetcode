package competition.doubleWeek75;

/**
 * @Title  数组的三角和
 * @Link
 * @Author KongTong
 * @Date   2022/4/2
 */
public class TriangularSum {
    public int triangularSum(int[] nums) {
        while (nums.length > 1) {
            int[] newNums = new int[nums.length - 1];
            for (int i = 0; i < newNums.length; i++) {
                newNums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            nums = newNums;
        }
        return nums[0];
    }
}
