package leetcode.all;

import leetcode.Structure.TreeNode;
import leetcode.Structure.TreeNodeMainClass;
import leetcode.Structure.TreeNodeWrapper;

public class problem543_二叉树的直径 {
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L + R + 1);
        return Math.max(L, R) + 1;
    }

    public static void main(String[] args) {
        problem543_二叉树的直径 problem = new problem543_二叉树的直径();
        String input = "[1,2,3,4,5]";
        TreeNode root = TreeNodeWrapper.stringToTreeNode(input);
        TreeNodeWrapper.prettyPrintTree(root);

        System.out.println(problem.diameterOfBinaryTree(root));
    }
}
