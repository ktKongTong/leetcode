package common;

/**
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/4/7
 */
public class _0121_MaxProfit {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length <= 1) {
            return maxProfit;
        }
        int min = prices[0];
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                maxProfit = Math.max(maxProfit, max - min);
            }else if(prices[i] < min) {
                min = prices[i];
                max = prices[i];
            }
        }
        return maxProfit;
    }
}
