package leetcode.all;

import leetcode.Structure.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class problem236_二叉树的最近公共祖先 {

    //  1、从根节点开始遍历二叉树，用哈希表记录每个节点的父节点指针
    //  2、从p节点开始不断地往它的祖先移动，并用数据结构记录已经访问过的祖先节点
    //  3、同样，再从q节点不断地往它的祖先移动，如果祖先已经被访问过，即意味着p和q的深度
    //  最深的公共祖先
    Map<Integer, TreeNode> parent = new HashMap<Integer, TreeNode>();
    Set<Integer> visited = new HashSet<Integer>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        while (p != null) {
            visited.add(p.val);
            p = parent.get(p.val);
        }
        while (q != null) {
            if (visited.contains(q.val)) {
                return q;
            }
            q = parent.get(q.val);
        }
        return null;
    }

    public void dfs(TreeNode root) {
        if (root.left != null) {
            parent.put(root.left.val, root);
            dfs(root.left);
        }
        if (root.right != null) {
            parent.put(root.right.val, root);
            dfs(root.right);
        }
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        // 递归终止条件，越过叶子结点或root == p 或 root == q
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor2(root.left, p, q);
        TreeNode right = lowestCommonAncestor2(root.right, p, q);
        if (left == null && right == null) return null;
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }

    public static void main(String[] args) {
        problem236_二叉树的最近公共祖先 solution = new problem236_二叉树的最近公共祖先();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.left.left= null;
        root.left.left.right = null;
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.left.left = null;
        root.right.left.right = null;
        root.right.right = new TreeNode(8);
        root.right.right.left = null;
        root.right.right.right = null;
        root.left.right.left = new TreeNode(7);
        root.left.right.left.left = null;
        root.left.right.left.right = null;
        root.left.right.right = new TreeNode(4);
        root.left.right.right.left = null;
        root.left.right.right.right = null;

        TreeNode p = new TreeNode(7);
        TreeNode q = new TreeNode(4);
        // TreeNode res = solution.lowestCommonAncestor(root, p, q);
        // System.out.println(res.val);
        TreeNode res2 = solution.lowestCommonAncestor2(root, p, q);
        System.out.println(res2.val);
    }

}
