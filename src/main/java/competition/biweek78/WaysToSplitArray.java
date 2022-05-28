package competition.biweek78;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/5/14
 */
public class WaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long left = 0;
        long right = sum;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            left = left + (long) nums[i];
            right = right - (long) nums[i];
            if(left>=right && i!=nums.length-1){
                res++;
            }
        }
        return res;
    }
}
