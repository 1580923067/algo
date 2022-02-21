package SwordOffer2;

import leetcode.Structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
// 从上往下打印二叉树的每一个节点，同一层从左往右顺序打印
public class problem32_从上到下打印二叉树Ⅰ {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>() {{
            add(root);
        }};
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);

        }

        return res;
    }

    public static void main(String[] args) {
        problem32_从上到下打印二叉树Ⅰ solution = new problem32_从上到下打印二叉树Ⅰ();
        TreeNode head = new TreeNode(3);
        head.left = new TreeNode(9);
        head.right = new TreeNode(2);
        head.right.left = new TreeNode(1);
        head.right.right = new TreeNode(7);
        int[] ans = solution.levelOrder(head);
        System.out.println(Arrays.toString(ans));
    }
}
