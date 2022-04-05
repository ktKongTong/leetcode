package swordToOfferSA;

import ds.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swordToOfferSA._0021_0040.*;

import java.util.Arrays;
import java.util.List;

public class _0021_0025_Test {
    // 0021 删除链表的倒数第 n 个结点
    @Test
    public void testRemoveNthFromEnd(){
        _0021_RemoveNthFromEnd removeNthFromEnd = new _0021_RemoveNthFromEnd();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode h = removeNthFromEnd.removeNthFromEnd(head,2);
        int i = 0;
        int [] res = new int[]{1,2,3,5};
        while (h != null){
            Assertions.assertEquals(res[i],h.val);
            h = h.next;
            i++;
        }
    }
    // 0022 链表中环的入口节点
    @Test
    public void testDetectCycle(){
        _0022_DetectCycle detectCycle = new _0022_DetectCycle();
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        ListNode res = detectCycle.detectCycle(head);
        Assertions.assertEquals(2,res.val);
    }
    // 0023 两个链表的第一个重合节点
    @Test
    public void testGetIntersectionNode(){
        _0023_GetIntersectionNode getIntersectionNode = new _0023_GetIntersectionNode();
        ListNode h1 = new ListNode(4);
        h1.next = new ListNode(1);
        h1.next.next = new ListNode(8);
        ListNode m = h1.next.next;
        m.next = new ListNode(4);
        m.next.next = new ListNode(5);
        ListNode h2 = new ListNode(5);
        h2.next = new ListNode(0);
        h2.next.next = new ListNode(1);
        h2.next.next.next = m;
        ListNode n = getIntersectionNode.getIntersectionNode(h1,h2);
        Assertions.assertEquals(n,m);
    }
    // 0024 反转链表
    @Test
    public void testReverseList(){
        _0024_ReverseList reverseList = new _0024_ReverseList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = reverseList.reverseList(head);
        int i = 5;
        while (res != null){
            Assertions.assertEquals(i,res.val);
            res = res.next;
            i--;
        }
    }
    // 0025 链表中的两数相加
    @Test
    public void testAddTwoNumbers(){
        _0025_AddTwoNumbers addTwoNumbers = new _0025_AddTwoNumbers();
        ListNode h1 = new ListNode(2);
        h1.next = new ListNode(4);
        h1.next.next = new ListNode(3);
//        342 + 465 = 807
        ListNode h2 = new ListNode(5);
        h2.next = new ListNode(6);
        h2.next.next = new ListNode(4);
        ListNode res = addTwoNumbers.addTwoNumbers(h1,h2);
        int i = 2;
        int[] resArr = new int[]{7,0,8};
        while (res != null){
            Assertions.assertEquals(resArr[i],res.val);
            res = res.next;
            i--;
        }
    }
}
