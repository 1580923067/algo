package leetcode.all;

import leetcode.Structure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class problem103_二叉树的锯齿形层序遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        boolean isOrderLeft = true;

        while (!nodeQueue.isEmpty()) {
            Deque<Integer> levelList = new LinkedList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode cueNode = nodeQueue.poll();
                if (isOrderLeft) {
                    levelList.offerLast(cueNode.val);
                } else {
                    levelList.offerFirst(cueNode.val);
                }
                if (cueNode.left != null) {
                    nodeQueue.offer(cueNode.left);
                }
                if (cueNode.right != null) {
                    nodeQueue.offer(cueNode.right);
                }
            }
            // ans.add(new LinkedList<Integer>(levelList));
            ans.add((List<Integer>) levelList);
            isOrderLeft = !isOrderLeft;
        }
        return ans;
    }

    public static void main(String[] args) {
        problem103_二叉树的锯齿形层序遍历 solution = new problem103_二叉树的锯齿形层序遍历();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> res = solution.zigzagLevelOrder(root);
        System.out.println(res);
    }
}
