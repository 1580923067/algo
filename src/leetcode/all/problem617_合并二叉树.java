package leetcode.all;

import leetcode.Structure.TreeNode;

public class problem617_合并二叉树 {
    // 深度优先搜索
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }

    // 广度优先搜索
    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2){
        return null;
    }
}
