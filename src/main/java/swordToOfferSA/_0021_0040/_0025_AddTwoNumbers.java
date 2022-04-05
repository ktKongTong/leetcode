package swordToOfferSA._0021_0040;

import ds.ListNode;

/**
 * @Title  链表中的两数相加
 * @Link   https://leetcode-cn.com/problems/lMSNwu/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0025_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headA = l1;
        ListNode headB = l2;
        if (headA == null || headB == null) {
            return headA == null ? headB : headA;
        }
        int lenA = 0;
        int lenB = 0;
        // 求长度
        while (headA != null) {
            headA = headA.next;
            lenA++;
        }
        while (headB != null) {
            headB = headB.next;
            lenB++;
        }
        headA = l1;
        headB = l2;
        int[] numsA = new int[Math.max(lenA, lenB)];
        int[] numsB = new int[Math.max(lenA, lenB)];
        int i = lenA-1;
        int j = lenB-1;
        while (headA != null) {
            numsA[i] = headA.val;
            headA = headA.next;
            i--;
        }
        while (headB != null) {
            numsB[j] = headB.val;
            headB = headB.next;
            j--;
        }
        ListNode head = null;
        int carry = 0;
        int k = 0;
        while (k<numsA.length) {
            int sum = (carry + numsA[k] + numsB[k]) % 10;
            head = this.addNode(sum, head);
            carry = (carry + numsA[k] + numsB[k]) / 10;
            k++;
        }
        if(carry == 1) {
            head = this.addNode(1, head);
        }
        return head;
    }
    public ListNode addNode(int val, ListNode head) {
        ListNode node = new ListNode(val);
        node.next = head;
        return node;
    }
}