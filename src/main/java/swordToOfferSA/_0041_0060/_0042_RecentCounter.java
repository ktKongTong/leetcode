package swordToOfferSA._0041_0060;

import java.util.LinkedList;
import java.util.Queue;
/**
 * @Title  最近请求次数
 * @Link   https://leetcode-cn.com/problems/H8086Q/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0042_RecentCounter {
    Queue<Integer> queue;
    public _0042_RecentCounter(){
        queue = new LinkedList<>();
    }
    public int ping(int t){
        queue.offer(t);
        while(queue.size()!=0 && queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}