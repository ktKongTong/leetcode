package common._0401_0500;

import java.util.*;

/**
 * @Author KongTong
 * @Link
 * @Title
 * @Date 2022/4/8
 */
public class _0429_LevelOrder {
    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                assert node != null;
                list.add(node.val);
                for (Node child : node.children) {
                    queue.offer(child);
                }

            }
            result.add(list);
        }
        return result;
    }
}
