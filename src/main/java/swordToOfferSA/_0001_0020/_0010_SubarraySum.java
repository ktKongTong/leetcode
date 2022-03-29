package swordToOfferSA._0001_0020;

import java.util.HashMap;
import java.util.Map;

/*
* @Title  和为 k 的子数组
* @Link   https://leetcode-cn.com/problems/QTMn0o/
* @Author KongTong
* @Date   2022/3/15
* */
public class _0010_SubarraySum {
    // HashMap + 前缀和
    public int subarraySum(int[] nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
