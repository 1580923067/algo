package leetcode.all;

import leetcode.Structure.Node;

import java.util.LinkedList;
import java.util.Queue;

public class problem116_填充每个节点的下一个右侧节点指针 {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                // 从队首取出元素
                Node node = queue.poll();
                if (i < size - 1) {
                    node.next = queue.peek();
                }
                // 下一层
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return root;
    }

    public Node connect1(Node root) {
        if (root == null) {
            return root;
        }
        Node leftmost = root;
        while (leftmost != null) {
            Node head = leftmost;
            while (head != null) {
                head.left.next = head.right;
                if (head.next != null) {
                    head.right.next = head.next.left;
                }
                head = head.next;
            }
            leftmost = leftmost.left;
        }
        return root;
    }

}
