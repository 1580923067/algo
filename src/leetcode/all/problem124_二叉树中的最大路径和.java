package leetcode.all;

import leetcode.Structure.TreeNode;

public class problem124_二叉树中的最大路径和 {
    int maxSum = Integer.MAX_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    public int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);

        int priceNewpath = node.val + leftGain + rightGain;

        maxSum = Math.max(maxSum, priceNewpath);
        return node.val + Math.max(leftGain, rightGain);
    }
}
