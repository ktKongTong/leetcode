package swordToOfferSA;

import ds.ListNode;
import ds.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import swordToOfferSA._0021_0040.*;

import java.util.Arrays;

public class _0026_0030_Test {
    // 0026 重排链表
    @Test
    public void testReorderList(){
        _0026_ReorderList reorderList = new _0026_ReorderList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        reorderList.reorderList(head);
        int [] res = {1,4,2,3};
        int i = 0;
        while (head != null){
            Assertions.assertEquals(res[i], head.val);
            head = head.next;
            i++;
        }
    }
    // 0027 回文链表
    @Test
    public void testIsPalindrome(){
        _0027_IsPalindrome isPalindrome = new _0027_IsPalindrome();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        Assertions.assertEquals(true, isPalindrome.isPalindrome(head));
    }
    // 0028 展平多级双向链表
    @Test
    public void testFlatten(){
        _0028_Flatten flatten = new _0028_Flatten();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        Node level2 = head.next.next.child = new Node(7);
        level2.next = new Node(8);
        level2.next.next = new Node(9);
        level2.next.next.next = new Node(10);
        Node level3 = level2.next.child = new Node(11);
        level3.next = new Node(12);
        flatten.flatten(head);
        int [] res = {1,2,3,7,8,11,12,9,10,4,5,6};
        int i = 0;
        while (head != null){
            Assertions.assertEquals(res[i], head.val);
            head = head.next;
            i++;
        }
    }
    // 0029 排序的循环链表
    @Test
    public void testInsert(){
        _0029_Insert insert = new _0029_Insert();
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(1);
        head.next.next.next = head;
        Node res = insert.insert(head,2);
        int [] result = {4,1,2,3};
        int i = 0;
        Node tmp = head.next;
        while (head != tmp){
            Assertions.assertEquals(result[i], tmp.val);
            tmp = tmp.next;
            i++;
        }
    }
    // 0030 插入、删除和随机访问都是 O(1) 的容器
    @Test
    public void testRandomizedSet(){
        _0030_RandomizedSet randomizedSet = new _0030_RandomizedSet();
        Assertions.assertEquals(true, randomizedSet.insert(1));
        Assertions.assertEquals(false, randomizedSet.remove(2));
        Assertions.assertEquals(true, randomizedSet.insert(2));
//        Assertions.assertEquals(1, randomizedSet.getRandom());
        Assertions.assertEquals(true, randomizedSet.remove(1));
        Assertions.assertEquals(false, randomizedSet.insert(2));
        Assertions.assertEquals(2, randomizedSet.getRandom());
    }

}
