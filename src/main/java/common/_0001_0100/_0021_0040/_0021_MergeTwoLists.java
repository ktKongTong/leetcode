package common._0001_0100._0021_0040;

import ds.ListNode;

public class _0021_MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null||l2 == null){
            return l1 == null?l2:l1;
        }
        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode head = new ListNode();
        while (h1 != null && h2 != null){
            if(h1.val < h2.val){
                head.next = h1;
                h1 = h1.next;
                head = head.next;
            }else {
                head.next = h2;
                h2 = h2.next;
                head = head.next;
            }
        }
        if(h1 == null){
            head.next = h2;
        }
        if(h2 == null){
            head.next = h1;
        }

        return head.next;
    }
}
