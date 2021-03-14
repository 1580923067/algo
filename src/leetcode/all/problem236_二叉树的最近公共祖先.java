package leetcode.all;

import leetcode.Structure.TreeNode;

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

}
