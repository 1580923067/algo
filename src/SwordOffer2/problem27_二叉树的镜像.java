package SwordOffer2;

import leetcode.Structure.TreeNode;

import java.util.Stack;

public class problem27_二叉树的镜像 {
    //方法1 递归
    public TreeNode mirroTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirroTree(root.right);
        root.right = mirroTree(tmp);
        return root;
    }

    //    方法2 辅助栈
    public TreeNode mirroTree2(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<TreeNode>() {{
            add(root);
        }};
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) stack.add(node.left);
            if (node.right != null) stack.add(node.right);
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }
}
