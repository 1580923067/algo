package leetcode.all;

import leetcode.Structure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class problem098_验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        double inorder = -Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }

    // 方法2 递归
    public boolean isValidBST2(TreeNode root) {
        return isValidBST2(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBST2(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        return isValidBST2(node.left, lower, node.val) && isValidBST2(node.right, node.val, upper);
    }
}
