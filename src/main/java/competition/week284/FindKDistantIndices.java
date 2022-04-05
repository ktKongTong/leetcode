package competition.week284;

import java.util.*;
/**
 * @Link https://leetcode-cn.com/problems/find-all-k-distant-indices-in-an-array/
 * @Title 2200. 找出数组中的所有 K 近邻下标
 * @Description 给你一个下标从 0 开始的整数数组 nums 和两个整数 key 和 k 。
 * K 近邻下标 是 nums 中的一个下标 i ，并满足至少存在一个下标 j 使得 |i - j| <= k 且 nums[j] == key。
 * @Date 2022/03/13
 * @author KongTong
 * */
public class FindKDistantIndices {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == key) {
                queue.offer(i);
            }
        }
        int pre = -1;
        int index;
        while(!queue.isEmpty()) {
            index = queue.poll();
            for (int j = Math.max(Math.max(0, index - k),pre + 1); j <= Math.min(nums.length - 1, index + k); j++) {
                res.add(j);
                pre = j;
            }
        }
        return res;
     }
}
