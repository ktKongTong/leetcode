package swordToOfferSA;

/**
 * @Title  爬楼梯的最少成本
 * @Link   https://leetcode-cn.com/problems/GzCJIP/
 * @Author KongTong
 * @Date   2022/3/20
 */
public class _0088_MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}
