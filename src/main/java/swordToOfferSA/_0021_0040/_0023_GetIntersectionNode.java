package swordToOfferSA._0021_0040;

import ds.ListNode;

public class _0023_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA==null||headB==null){
            return null;
        }
        int lenA = 1;
        int lenB = 1;
        ListNode pointA = headA;
        ListNode pointB = headB;
        while(pointA.next!=null){
            pointA = pointA.next;
            lenA++;
        }
        while(pointB.next!=null){
            pointB = pointB.next;
            lenA++;
        }
        pointA = headA;
        pointB = headB;
        if(lenA>lenB){
            for (int i = 0; i < Math.abs(lenA-lenB); i++) {
                pointA = pointA.next;
            }
        }else{
            for (int i = 0; i < Math.abs(lenA-lenB); i++) {
                pointB = pointB.next;
            }
        }
        while(pointA!=pointB&&pointA!=null&&pointB!=null){
            pointA = pointA.next;
            pointB = pointB.next;
        }
        return pointA;
    }
    public ListNode getIntersectionNodeBetter(ListNode headA, ListNode headB){
        if(headA==null||headB==null){
            return null;
        }
        int lenA = 1;
        int lenB = 1;
        ListNode pointA = headA;
        ListNode pointB = headB;
        while(pointA.next!=null&&pointB.next!=null){
            pointA = pointA.next;
            lenA++;
        }
        while(pointB.next!=null){
            pointB = pointB.next;
            lenB++;
        }
        pointA = headA;
        pointB = headB;
        if(lenA>lenB){
            for (int i = 0; i < Math.abs(lenA-lenB); i++) {
                pointA = pointA.next;
            }
        }else{
            for (int i = 0; i < Math.abs(lenA-lenB); i++) {
                pointB = pointB.next;
            }
        }
        while(pointA!=pointB&&pointA!=null&&pointB!=null){
            pointA = pointA.next;
            pointB = pointB.next;
        }
        return pointA;
    }
}