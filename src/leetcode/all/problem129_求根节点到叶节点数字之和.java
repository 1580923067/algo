package leetcode.all;

import leetcode.Structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class problem129_求根节点到叶节点数字之和 {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }

    // 广度优先

}
