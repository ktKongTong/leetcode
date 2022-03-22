package swordToOfferSA._0021_0040;

import ds.Node;

public class _0029_Insert {
    public Node insert(Node head, int insertVal){
        Node node=new Node();
        node.val = insertVal;
        // 长度0
        if(head==null){
            node.next = node;
            return node;
        }
        // 长度1
        if(head.next==head){
            node.next=head;
            head.next=node;
            return head;
        }
        Node cur = head.next;
        Node max = head;
        Node min = head.next;
        while(cur!=head){
            if(cur.val>=max.val){
                max = cur;
                min= max.next;
            }
            cur=cur.next;
        }
        if(insertVal<=min.val||insertVal>=max.val){
            max.next = node;
            node.next=min;
            return head;
        }
        // 在中间插入
        boolean insert = true;
        cur = min;
        while (insert){
            if(cur.val<=insertVal&&insertVal<=cur.next.val){
                node.next=cur.next;
                cur.next = node;
                insert = false;
            }
            cur = cur.next;
        }
        return head;
    }
}