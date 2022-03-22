package swordToOfferSA._0021_0040;

import ds.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class _0021_RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        // 先获得长度
        int len = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            len++;
        }
        // 特殊处理，要删除的就是头节点的情况
        if(len-n==0){
            head = head.next;
            return head;
        }
        ListNode pre = head;
        for (int i = 0; i <len - n - 1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }
    // 快慢指针
    public ListNode fastRemoveNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        // 快指针先走n步
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // 刚好删除头节点
        if(fast == null){
            head = head.next;
            return head;
        }
        // 快慢指针同时走
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}