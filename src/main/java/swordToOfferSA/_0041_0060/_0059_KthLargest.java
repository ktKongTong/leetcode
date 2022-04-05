package swordToOfferSA._0041_0060;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Title  数据流的第 K 大数值
 * @Link   https://leetcode-cn.com/problems/jBjn9C/
 * @Author KongTong
 * @Date   2022/3/16
 */
public class _0059_KthLargest {
    private final int k;
    private static class Node{
        int val;
        Node next;
        Node(){
        }
        Node(int val) {
            this.val = val;
        }
    }
    private Node head = new Node();
    private Node tail = head;
    private int size = 0;
    public _0059_KthLargest(int k, int[] nums) {
        this.k = k;
        Arrays.sort(nums);
        for (int i = Math.max(nums.length - k, 0); i <= nums.length - 1; i++) {
            tail.next = new Node(nums[i]);
            tail = tail.next;
            size++;
        }
    }

    public int add(int val) {
        // 只有在listSize = k时，才可直接判断
        if(size == k) {
            int kth = head.next.val;
            if(val<= kth) {
                return kth;
            }
        }
        Node h = head;
        while (h.next!=null&&h.next.val<val) {
            h = h.next;
        }
        Node node = new Node(val);
        node.next = h.next;
        h.next =node;
        size++;
        if(size>k) {
            head.next = head.next.next;
        }
        return head.next.val;
    }
}
