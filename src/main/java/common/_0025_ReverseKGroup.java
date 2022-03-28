package common;

import ds.ListNode;

/*
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/3/24
 */
public class _0025_ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k == 1) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            count++;
            if (count % k == 0) {
                pre = reverse(pre, cur.next);
                cur = pre.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode pre, ListNode next) {
        ListNode cur = pre.next;
        ListNode nextNext = next.next;
        while (cur != next) {
            next.next = cur.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = next.next;
        }
        return next;
    }
}
