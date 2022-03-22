package swordToOfferSA._0021_0040;

import ds.ListNode;

public class _0026_ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null;
        second = reverse(second);
        merge(head, second);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    private void merge(ListNode first, ListNode second) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (first != null && second != null) {
            cur.next = first;
            first = first.next;
            cur = cur.next;
            cur.next = second;
            second = second.next;
            cur = cur.next;
        }
        if (first != null) cur.next = first;
        if (second != null) cur.next = second;
    }


//    public void reorderList(ListNode head) {
//        if(head==null||head.next==null){
//            return head;
//        }
//        ListNode hiPre = head;
//        ListNode hi = head;
//        ListNode hj = head;
//        while(hj!=null&&hj.next!=null){
//            hiPre = hi;
//            hi = hi.next;
//            hj = head.next.next;
//        }
//        // 翻转后半部分
//        hiPre.next = this.reverseList(hi);
//        //重排
//        ListNode h1 = head;
//        // switch
//        h1.next = hiPre.next;
//
//
//    }
//    public void reverseList(ListNode head){
//        // 翻转后半部分
//        return head;
//    }
}