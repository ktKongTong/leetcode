package swordToOfferSA;

import ds.ListNode;

import java.util.PriorityQueue;

/**
 * @Title  合并排序链表
 * @Link   https://leetcode-cn.com/problems/vvXgSW/
 * @Author KongTong
 * @Date   2022/3/22
 */
public class _0078_MergeKLists{
    public ListNode mergeKLists(ListNode[] lists) {
        // 优先队列
        PriorityQueue<ListNode> pq = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!pq.isEmpty()) {
            cur.next = pq.poll();
            cur = cur.next;
            if (cur.next != null) {
                pq.offer(cur.next);
            }
        }
        return dummy.next;
    }
}
