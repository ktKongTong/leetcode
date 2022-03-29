package swordToOfferSA._0001_0020;

import java.util.HashMap;
import java.util.Map;

/*
* @Title  0 和 1 个数相同的子数组
* @Link   https://leetcode-cn.com/problems/A1NYOS/
* @Author KongTong
* @Date   2022/3/15
* */
public class _0011_FindMaxLength {
    // 前缀和 + HashMap
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        map.put(counter, -1);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num == 1) {
                counter++;
            } else {
                counter--;
            }
            if (map.containsKey(counter)) {
                int prevIndex = map.get(counter);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                map.put(counter, i);
            }
        }
        return maxLength;
    }
}
