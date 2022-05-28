package common._0001_0100._0081_0100;

public class _0083_DeleteDuplicates {
    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int x, ListNode n) { val = x; next = n; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode next = head.next;
        while(next != null) {
            if(pre.val == next.val) {
                pre.next = next.next;
                next = next.next;
            }else {
                pre = next;
                next = next.next;
            }
        }
        return head;
    }
}
