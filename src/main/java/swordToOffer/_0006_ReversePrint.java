package swordToOffer;

import ds.ListNode;


/**
 * @Title
 * @Link
 * @Author KongTong
 * @Date 2022/3/22
 */
public class _0006_ReversePrint {
    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        int length = 0;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        int[] res = new int[length];
        int i = length;
        while (head != null) {
            res[i - 1] = head.val;
            i--;
            head = head.next;
        }
        return res;
    }
}
