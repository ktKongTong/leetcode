package swordToOfferSA._0041_0060._0021_0040;

import java.util.LinkedList;
import java.util.Queue;

public class _0042_RecentCounter {
    Queue<Integer> queue;
    public _0042_RecentCounter(){
        queue = new LinkedList<>();
    }
    public int ping(int t){
        queue.offer(t);
        while(queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}