package swordToOfferSA._0041_0060;

import ds.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class _0043_CBTInserter {
    private TreeNode root;
    private ArrayList<Integer> list = new ArrayList<>();
    private int size;
    public void visit(TreeNode node){
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(node);
        TreeNode cur;
        while (!queue.isEmpty()){
            cur = queue.poll();
            list.add(cur.val);
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            if (cur.right!=null){
                queue.offer(cur.right);
            }
            size++;
        }
    }
    public _0043_CBTInserter(TreeNode root) {
        this.root = root;
        visit(root);
    }

    public int insert(int v) {
        TreeNode node = new TreeNode(v);
        size++;
        int parent = list.get(size/2-1);
        TreeNode cur = root;
        int i = size;
        Stack<Integer> stack = new Stack<>();
        while(i!=1){
            stack.push(i);
            i/=2;
        }
        while(stack.size()!=1){
            int temp = stack.pop();
            if(temp%2==0){
                cur = cur.left;
            }else{
                cur = cur.right;
            }
        }
        if(cur.left==null){
            cur.left = node;
        }else {
            cur.right = node;
        }
        list.add(node.val);
        return parent;
    }

    public TreeNode get_root() {
        return root;
    }
}