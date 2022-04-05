package ds;

/**
 * 多级双向链表节点
 */
public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    public Node(){}
    public Node(int val){
        this.val = val;
    }
}