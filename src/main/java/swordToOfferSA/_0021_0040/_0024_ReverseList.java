package swordToOfferSA._0021_0040;

import ds.ListNode;

/**
 * @Title  反转链表
 * @Link   https://leetcode-cn.com/problems/UHnkqh/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0024_ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode newHead = head;
        ListNode point = head.next;
        ListNode tmp;
        newHead.next = null;
        while(point!=null){
            tmp = point;
            point = point.next;
            tmp.next = newHead;
            newHead = tmp;
        }
        return newHead;
    }
}
