package swordToOfferSA._0021_0040;

import java.util.HashMap;

/**
 * @Title  最近最少使用缓存
 * @Link   https://leetcode-cn.com/problems/OrIXps/
 * @Author KongTong
 * @Date   2022/3/15
 */
public class _0031_LRUCache {
    // 双向链表
    private static class Node{
        Node pre;
        Node next;
        int key;
        int value;
        public Node(){

        }
        public Node(int key, int val){
            this.key = key;
            this.value = val;
        }
    }
    int capacity;
    Node head,tail;
    int size = 0;
    // HashMap<Key, Node>
    private HashMap<Integer, Node> map = new HashMap<>();
    public _0031_LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }
    public int get(int key) {
        Node node = map.get(key);
        if(node==null){
            return -1;
        }
        // 放到头部
        moveToHead(head, node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if(node==null){
            if(size==capacity){
                // 删除尾部
                Node last = tail.pre;
                removeNode(last);
                map.remove(last.key);
                size--;
            }
            node = new Node(key, value);
            map.put(key,node);
            size++;
        }else{
            node.value = value;
        }
        moveToHead(head, node);
    }

    public static void moveToHead(Node head, Node node){
        removeNode(node);
//        node.pre.next = node.next;
//        node.next.pre = node.pre;
        head.next.pre = node;
        node.next = head.next;
        head.next = node;
        node.pre = head;
    }
    public static void removeNode(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }
}