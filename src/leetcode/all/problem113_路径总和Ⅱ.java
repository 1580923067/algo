package leetcode.all;

import leetcode.Structure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class problem113_路径总和Ⅱ {
    List<List<Integer>> ret = new LinkedList<>();
    Deque<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetNum) {
        dfs(root, targetNum);
        return ret;
    }

    public void dfs(TreeNode root, int targetNum) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        targetNum -= root.val;
        if (root.left == null && root.right == null && targetNum == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, targetNum);
        dfs(root.right, targetNum);
        path.pollLast();
    }
}
