package leetcode.all;

import com.sun.jmx.snmp.SnmpNull;
import leetcode.Structure.TreeNode;

public class problem404_左叶子之和 {
    public int sunOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    private int dfs(TreeNode node) {
        int ans = 0;
        if (node.left != null) {
            ans += isLeafNode(node.left) ? node.left.val : dfs(node.left);
        }
        if (node.right != null && !isLeafNode(node.right)) {
            ans += dfs(node.right);
        }
        return ans;

    }

    private boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
