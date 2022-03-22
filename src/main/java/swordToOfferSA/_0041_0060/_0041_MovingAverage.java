package swordToOfferSA._0041_0060._0021_0040;

import java.util.ArrayDeque;
import java.util.Queue;

public class _0041_MovingAverage {
    private final Queue<Integer> queue;
    private final int size;
    private int sum;
    public _0041_MovingAverage(int size) {
        this.size = size;
        this.queue = new ArrayDeque<>();
    }

    public double next(int val) {
        if(queue.size() == size) {
            sum = sum - queue.poll();
        }
        // 相加
        sum += val;
        // 入队
        queue.offer(val);
        // 返回平均值
        return sum/((double) queue.size());
    }
}