package swordToOfferSA._0021_0040;

/**
 * @Title  每日温度
 * @Link   https://leetcode-cn.com/problems/iIQa4I/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0038_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures.length < 2){
            return new int[]{0};
        }
        int[] res = new int[temperatures.length];
        int max = temperatures[temperatures.length - 1];
        int maxIdx = temperatures.length - 1;
        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (i == temperatures.length - 1||temperatures[i] >= max) {
                max = temperatures[i];
                res[i] = 0;
                continue;
            }
            for (int j = i + 1; j <= maxIdx; j++) {
                if (temperatures[j] > temperatures[i]) {
                    maxIdx = j;
                    max = temperatures[j];
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }
}