package leetcode.all;

import leetcode.Structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class problem104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


    public int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        // 将root节点添加到队列
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            // 依次弹出二叉树每一层的节点
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}
