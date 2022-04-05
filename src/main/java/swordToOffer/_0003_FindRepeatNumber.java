package swordToOffer;

import java.util.HashMap;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/3/22
 */
public class _0003_FindRepeatNumber {
    public int hashFindRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return num;
            }
            map.put(num, 1);
        }
        return -1;
    }
    public int findRepeatNumber(int[] nums) {
        // 题目说明 nums 数值大小在 1~n-1 之间
        int[] arr = new int[nums.length];
        for (int num : nums) {
            if (arr[num] == 1) {
                return num;
            }
            arr[num] = 1;
        }
        return -1;
    }
}
