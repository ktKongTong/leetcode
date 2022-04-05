package common;


import java.util.HashMap;
import java.util.Map;

/**
 * @Title 所有 O(1) 的数据结构
 * @Link https://leetcode-cn.com/problems/all-oone-data-structure/
 * @Author KongTong
 * @Date 2022/3/16
 */
public class _0432_AllOne {
    private static class Node {
        String key;
        int val;
        Node next;
        Node prev;

        public Node(String key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private static class ValNode {
        Node head;
        Node tail;
        public ValNode(Node node) {
            this.head = node;
            this.tail = node;
        }
    }
    private final Map<String, Node> keyMap;
    private final Map<Integer, ValNode> valMap;
    private final Node head;
    private final Node tail;

    private void addNodeToTail(Node node){
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;
        node.next = tail;
    }
    public _0432_AllOne() {
        keyMap = new HashMap<>();
        valMap = new HashMap<>();
        head = new Node("", Integer.MAX_VALUE);
        tail = new Node("", Integer.MIN_VALUE);
        tail.next = null;
        head.next = tail;
        tail.prev = head;
        head.prev = null;
    }

    public void inc(String key) {
        // 不存在key的情况
        if(!keyMap.containsKey(key)){
            Node node = new Node(key, 1);
            keyMap.put(key, node);
            if(!valMap.containsKey(1)){
                valMap.put(1, new ValNode(node));
            }else{
                valMap.get(1).tail = node;
            }
            addNodeToTail(node);
            return;
        }

        // 存在key的情况
        Node node = keyMap.get(key);
        ValNode valNode= valMap.get(node.val);
        // 要插入的位置不存在，移到头部，新增该值
        if(!valMap.containsKey(node.val+1)){
            // 该值仅有一个
            if(valNode.head == valNode.tail){

                valMap.remove(node.val);
                valMap.put(node.val+1, valNode);
                node.val++;
                return;
            }
            // 该值有多个，但为头
            if(node == valNode.head){
                valNode.head = node.next;
                node.val++;
                // 新增
                valMap.put(node.val, new ValNode(node));
                return;
            }
            // 该值有多个，但为尾
            if(node == valNode.tail){
                valNode.tail = node.prev;
            }
            node.val++;
            // 新增
            valMap.put(node.val, new ValNode(node));
            // 取出Node
            node.prev.next = node.next;
            node.next.prev = node.prev;
            // 移到新位置
            node.prev = valNode.head.prev;
            node.next = valNode.head;
            valNode.head.prev.next = node;
            valNode.head.prev = node;
            return;
        }
        // 要插入的位置存在
        ValNode newValNode = valMap.get(node.val+1);
        if(valNode.head == valNode.tail){
            valMap.remove(node.val);
        }else if (node == valNode.head) {
            valNode.head = node.next;
        }else if(node == valNode.tail){
            valNode.tail = node.prev;
        }
        node.val++;
        // 取出Node
        node.prev.next = node.next;
        node.next.prev = node.prev;
        // 移到新位置
        node.prev = newValNode.tail;
        node.next = newValNode.tail.next;
        newValNode.tail.next.prev = node;
        newValNode.tail.next = node;
        newValNode.tail = node;
    }

    public void dec(String key) {
        Node node = keyMap.get(key);
        ValNode valNode= valMap.get(node.val);
        // 值为1
        if(node.val == 1){
            keyMap.remove(key);
            // 值为1的节点只有一个
            if(valNode.head == valNode.tail){
                valMap.remove(node.val);
            }else if(node == valNode.head){
                valNode.head = node.next;
            }else if(node == valNode.tail){
                valNode.tail = node.prev;
            }
            // 取出Node
            node.prev.next = node.next;
            node.next.prev = node.prev;
            return;
        }
        // 值大于1
        // 要插入的位置不存在，移到头部，新增该值
        if(!valMap.containsKey(node.val - 1)){
            // 该值仅有一个
            if(valNode.head == valNode.tail){
                valMap.remove(node.val);
                valMap.put(node.val-1, valNode);
                node.val--;
                return;
            }
            // 该值有多个，但为尾
            if(node == valNode.tail){
                valNode.tail = node.prev;
                node.val--;
                // 新增
                valMap.put(node.val, new ValNode(node));
                return;
            }
            // 该值有多个，但为头
            if(node == valNode.head){
                valNode.head = node.next;
            }
            node.val--;
            // 新增
            valMap.put(node.val, new ValNode(node));
            // 取出Node
            node.prev.next = node.next;
            node.next.prev = node.prev;
            // 移到新位置
            node.next = valNode.tail.next;
            node.prev = valNode.tail;
            valNode.tail.next.prev = node;
            valNode.tail.next = node;
            return;
        }
        // 要插入的位置存在
        ValNode newValNode = valMap.get(node.val - 1);
        if(valNode.head == valNode.tail){
            valMap.remove(node.val);
        }else if (node == valNode.head) {
            valNode.head = node.next;
        }else if(node == valNode.tail){
            valNode.tail = node.prev;
        }
        node.val--;
        // 取出Node
        node.prev.next = node.next;
        node.next.prev = node.prev;
        // 移到新位置
        node.next = newValNode.head;
        node.prev = newValNode.head.prev;
        newValNode.head.prev.next = node;
        newValNode.head.prev = node;
        newValNode.head = node;
    }

    public String getMaxKey() {
        return head.next.key;
    }

    public String getMinKey() {
        return tail.prev.key;
    }
}
