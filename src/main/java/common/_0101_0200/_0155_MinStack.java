package common._0101_0200;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/4/8
 */
public class _0155_MinStack {
    private PriorityQueue<Integer> minHeap;
    private Stack<Integer> stack;
    public _0155_MinStack() {
        minHeap = new PriorityQueue<>();
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        minHeap.offer(val);
    }

    public void pop() {
        int i = stack.pop();
        minHeap.remove(i);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        assert !minHeap.isEmpty();
        return minHeap.peek();
    }
}
