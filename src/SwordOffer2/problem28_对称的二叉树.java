package SwordOffer2;

import leetcode.Structure.TreeNode;

public class problem28_对称的二叉树 {
    public boolean isStmmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    public boolean recur(TreeNode L, TreeNode R) {
        if (L == null && R == null) return true;
        if (L == null || R == null || L.val != R.val) return false;
        return recur(L.left, R.right) && recur(L.right,R.left);
    }
}
