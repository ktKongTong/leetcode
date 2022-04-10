package common;

import ds.ListNode;

/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/4/9
 */
public class _0160_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        if (A == null || B == null) {
            return null;
        }
        ListNode a = A;
        ListNode b = B;
        while (a != b) {
            a = a.next;
            b = b.next;
            if (a == b) {
                return a;
            }
            if (a == null) {
                a = B;
            }
            if (b == null) {
                b = A;
            }
        }
        return a;
    }
}
