package swordToOfferSA._0021_0040;

import ds.Node;

import java.util.Stack;
public class _0028_Flatten {

    public Node flatten(Node head) {
        if(head == null){
            return null;
        }
        Node cur = head;
        while(cur != null){
            if(cur.child != null){
                Node next = cur.next;
                Node child = flatten(cur.child);
                cur.child = null;
                cur.next = child;
                child.prev = cur;
                while(child.next != null){
                    child = child.next;
                }
                child.next = next;
                if(next!=null){
                    next.prev = child;
                }

            }
            cur = cur.next;
        }
        return head;
    }
    public Node flattenByStack(Node head){
        if(head == null){
            return null;
        }
        Node cur = head;
        Stack<Node> stack = new Stack<>();
        while(cur != null){
            if(cur.child != null && cur.next==null){
                cur.next = cur.child;
                cur.child.prev = cur;
                cur.child = null;
            }
            else if(cur.child != null){
                stack.push(cur.next);
                cur.next = cur.child;
                cur.child.prev = cur;
                cur.child = null;
            }
            else if(cur.next == null && !stack.isEmpty()){
                cur.next = stack.pop();
                cur.next.prev = cur;

            }
            cur = cur.next;
        }
        return head;
    }
}