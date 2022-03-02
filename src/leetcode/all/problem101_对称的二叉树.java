package leetcode.all;

import leetcode.Structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class problem101_对称的二叉树 {
    // 递归
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    // 迭代
    public boolean isSymmetric1(TreeNode root){
        return check1(root, root);
    }

    private boolean check1(TreeNode u, TreeNode v) {
        Queue<TreeNode> q = new LinkedList<>();
        // 添加根节点到队列中
        q.offer(u);
        q.offer(v);
        while (!q.isEmpty()){
            // 移除根节点
            u=q.poll();
            v=q.poll();
            // 只有一个根节点情况
            if (u == null && v == null) {
                continue;
            }
            if ((u == null && v == null) || (u.val !=v.val)){
                return false;
            }

            q.offer(u.left);
            q.offer(v.right);

            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }

}
