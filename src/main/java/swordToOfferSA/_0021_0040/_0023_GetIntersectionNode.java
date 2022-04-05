package swordToOfferSA._0021_0040;

import ds.ListNode;
/**
 * @Title  两个链表的第一个重合节点
 * @Link   https://leetcode-cn.com/problems/3u1WK4/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0023_GetIntersectionNode {
    // 先求长度
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA==null || headB==null){
            return null;
        }
        int lenA = 0;
        int lenB = 0;
        ListNode pointA = headA;
        ListNode pointB = headB;
        while(pointA != null){
            pointA = pointA.next;
            lenA++;
        }
        while(pointB != null){
            pointB = pointB.next;
            lenB++;
        }
        pointA = headA;
        pointB = headB;
        for (int i = 0; i < Math.abs(lenA-lenB); i++) {
            pointA = lenA<lenB ? pointA : pointA.next;
            pointB = lenA<lenB ? pointB.next : pointB;
        }
        while(pointA != pointB && pointA!=null && pointB != null){
            pointA = pointA.next;
            pointB = pointB.next;
        }
        return pointA;
    }
}