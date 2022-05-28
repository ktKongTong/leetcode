package common._0101_0200._0121_0140;

/**
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/4/7
 */
public class _0136_SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}
