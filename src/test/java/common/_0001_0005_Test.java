package common;

import common._0001_0020._0004_FindMedianSortedArrays;
import common._0021_0040._0021_MergeTwoLists;
import ds.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _0001_0005_Test {
    @Test
    public void testFindMedianSortedArrays(){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        _0004_FindMedianSortedArrays findMedianSortedArrays = new _0004_FindMedianSortedArrays();
        double res = findMedianSortedArrays.findMedianSortedArrays(nums1,nums2);
        Assertions.assertEquals(2.5,res);
    }
    @Test
    public void testMergeTwoLists(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next = l5;
        l5.next = l6;
        _0021_MergeTwoLists mergeTwoLists = new _0021_MergeTwoLists();
        ListNode res = mergeTwoLists.mergeTwoLists(l1,l4);
//        Assertions.assertEquals(1,res.val);
    }
}
