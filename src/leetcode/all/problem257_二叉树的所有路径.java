package leetcode.all;

import leetcode.Structure.ListNode;
import leetcode.Structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class problem257_二叉树的所有路径 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        constructPaths(root, "", paths);
        return paths;
    }

    private void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer();
            pathSB.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {
                paths.add(pathSB.toString());
            } else {
                pathSB.append("->");
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }
}
