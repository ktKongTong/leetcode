package swordToOfferSA._0001_0020;

import java.util.Arrays;
import java.util.HashMap;

/*
* @Title  只出现一次的数字
* @Link   https://leetcode-cn.com/problems/WGki4K/
* @Author KongTong
* @Date   2022/3/15
* */
public class _0004_SingleNumber {
    /*
     * 位运算
     * */
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; ++i) {
            int total = 0;
            for (int num : nums) {
                total += ((num >> i) & 1);
            }
            if (total % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }
    /*
    * HashMap
    * */
    public int HashSingleNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            int count = hashMap.getOrDefault(num, 0);
            if (++count == 3) {
                // 遇到三个元素的就从HashMap中删除，再也不会遇到了
                hashMap.remove(num);
            } else {
                hashMap.put(num, count);
            }
        }
        return (int) hashMap.keySet().toArray()[0];
    }
    /*
    * 排序扫描
    * */
    public int sortSingleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i += 3) {
            if(nums[i] != nums[i + 1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
