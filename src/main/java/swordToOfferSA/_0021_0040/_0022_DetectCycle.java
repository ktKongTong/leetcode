package swordToOfferSA._0021_0040;

import ds.ListNode;

/*
  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 */
/**
 * @Title  链表中环的入口节点
 * @Link   https://leetcode-cn.com/problems/c32eOV/
 * @Author KongTong
 * @Date   2022/3/15
*/
public class _0022_DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        // 快慢指针
        ListNode slow = head;
        ListNode fast = head;
        // 快指针每次走两步，慢指针每次走一步
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                // 如果有环，则快指针一定会在环中相遇
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}