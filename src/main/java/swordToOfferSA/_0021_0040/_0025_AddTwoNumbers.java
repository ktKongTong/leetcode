package swordToOfferSA._0021_0040;

import ds.ListNode;

import java.util.Arrays;

public class _0025_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode headA = l1;
        ListNode headB = l2;
        if (headA == null || headB == null) {
            return headA == null ? headB : headA;
        }
        int lenA = 1;
        int lenB = 1;
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
        System.out.println(Arrays.toString(numsA));
        System.out.println(Arrays.toString(numsB));
        headA = l1;
        headB = l2;
        ListNode head = null;
        int carry = 0;
        int k = numsA.length-1;
        while (numsA[k] != 0 || numsB[k] != 0) {
            int sum = (carry + numsA[k] + numsB[k]) % 10;
            head = this.addNode(sum, head);
            carry = (carry + numsA[k] + numsB[k]) / 10;
            k--;
        }
        if(carry == 1) {
            head = this.addNode(1, head);
        }
        // 顺序
        return head;
    }

    public ListNode addNode(int val, ListNode head) {
        ListNode node = new ListNode(val);
        node.next = head;
        return node;
    }
}