package swordToOfferSA._0021_0040;

import ds.ListNode;

public class _0027_IsPalindromeList {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        int len = 0;
        while(fast.next!=null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            len++;
        }
        if(fast.next!=null){
            len++;
        }
        int[] nums = new int[len];
        ListNode point = head;
        for(int i = len-1;i>=0;i--){
            nums[i] = point.val;
            point = point.next;
        }
        int i = 0;
        slow = slow.next;
        while(slow!=null&&slow.val==nums[i]){
            slow = slow.next;
            i++;
        }
        return slow == null;
    }
    //O(1) 空间复杂度
    public boolean isPalindromeO1(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 翻转slow之后的链表
        ListNode pre = slow;
        slow = slow.next;
        pre.next = reverseList(slow);
        ListNode point = head;
        while(slow!=null){
            if(slow.val != point.val){
                return false;
            }
            slow = slow.next;
            point = point.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode point = head;
        while(point!=null){
            ListNode next = point.next;
            point.next = pre;
            pre = point;
            point = next;
        }
        return pre;
    }
}