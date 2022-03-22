package swordToOfferSA;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/21
 */
public class _0101_CanPartition {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums) sum += i;
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        int[] dp = new int[target+1];
        for(int i = 0; i < n; i++){
            int t = nums[i];
            for(int j = target; j >=0 ; j--){
                if(j >= t) dp[j] = Math.max(dp[j],dp[j-t]+t);
                else dp[j] = dp[j];
            }
        }
        return dp[target]==target;
    }
}
