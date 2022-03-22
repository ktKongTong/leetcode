package swordToOfferSA;

import ds.ListNode;

import java.util.PriorityQueue;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/22
 */
public class _0078_MergeKLists{
//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists == null || lists.length == 0) return null;
//        return merge(lists, 0, lists.length - 1);
//    }
//    public ListNode merge(ListNode[] lists, int start, int end) {
//        if (start == end) return lists[start];
//        int mid = (start + end) / 2;
//        ListNode left = merge(lists, start, mid);
//        ListNode right = merge(lists, mid + 1, end);
//        return mergeTwoLists(left, right);
//    }
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode dummy = new ListNode(0);
//        ListNode cur = dummy;
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                cur.next = l1;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                l2 = l2.next;
//            }
//            cur = cur.next;
//        }
//        if (l1 != null) cur.next = l1;
//        if (l2 != null) cur.next = l2;
//        return dummy.next;
//    }
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
